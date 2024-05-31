package Mensagem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit; // Importe esta classe
import Back.Conection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class VerificaData {
    
    private int op;
    private long diasrestantes;
     private Timer blinkTimer;
           
  public void verificacaodata() {
    Date dataAtual = new Date(); // Data atual
    long diasRestantes = 0;
    
    // Converta a data do banco para o tipo Date
    String dataBancoString = new Conection().getData();
    DateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
    Date dataBanco = null;
    try {
        // Construa a data do banco a partir da data atual, mas ajuste o dia, mês e ano do banco
        String[] partesDataBanco = dataBancoString.split("-");
        int ano = Integer.parseInt(partesDataBanco[0]);
        int mes = Integer.parseInt(partesDataBanco[1]);
        int dia = Integer.parseInt(partesDataBanco[2]);
        dataBanco = new Date(ano - 1900, mes - 1, dia); // Ano - 1900 porque Date considera 1900 como ano base
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    // Calcule a diferença entre as datas
    long diferencaMillis = dataBanco.getTime() - dataAtual.getTime();
    long diferencaDias = TimeUnit.DAYS.convert(diferencaMillis, TimeUnit.MILLISECONDS);

    // Verifique se a diferença é menor ou igual a 90 dias
    if (diferencaDias >= 90) {
        this.op = 1;
    } else if (diferencaDias >= 30) {
       this.op = 2;
    } else if (diferencaDias >= 15) {
        this.op= 3;
    } else if (diferencaDias >= 0) {
        this.op = 4;
    } else if (diferencaDias >= -4) {
        this.op = 5;
    } else if(diferencaDias <-4) {
        this.op = 6;
    }

    this.diasrestantes = diferencaDias; // Utilize Math.abs() para garantir que diasRestantes seja sempre positivo

    
}


    public int getCodigoOperacao() {
        verificacaodata();
        return op;
    }

    public long getDiasRestantes() {
        verificacaodata();
        return diasrestantes;
  }
    
    
    
    
    
 

    public void startBlinking(javax.swing.JLabel label) {
        blinkTimer = new Timer(500, new ActionListener() {
            private boolean visible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(visible);
                visible = !visible;
            }
        });
        blinkTimer.start();
    }

    public void stopBlinking() {
        if (blinkTimer != null) {
            blinkTimer.stop();
        }
    }
}

    


