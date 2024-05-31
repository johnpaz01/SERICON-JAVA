package Back;

import Front.*;

public class Verificacoes {

    public void telaEscolhida(Integer op) {
        switch (op) {
            case 1:
                TelaPrincipal tlp = new TelaPrincipal();
                tlp.setVisible(true);
                break;
            case 2:
                CadastroFuncionarios tlc = new CadastroFuncionarios();
                tlc.setVisible(true);
                break;
            case 3:
                ExcluirFuncionarios tle = new ExcluirFuncionarios();
                tle.setVisible(true);
                break;
            case 4:
                Front.ExcluirPedidos tlep = new Front.ExcluirPedidos();
                tlep.setVisible(true);
                break;
            case 5:
                Front.EdicaoFuncionarios tlef = new EdicaoFuncionarios();
                tlef.setVisible(true);
                break;
            default:
                throw new IllegalArgumentException("Opção inválida: " + op);

        }

    }
}
