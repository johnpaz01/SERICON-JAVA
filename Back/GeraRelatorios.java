package Back;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GeraRelatorios {

    public static double valor = 0.0;

    public static void gerarNotaFiscal(int idPedido) {
        String TimeForPDF = getCurrentDateTime();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvar Relatório de Pedidos por Ano");
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
            }

            try {
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                // Adicione o conteúdo da nota fiscal ao documento PDF
                addContentToNotaFiscal(document, idPedido);

                // Informações da empresa
                Paragraph empresaInfo = new Paragraph(
                        "Sericon - Estamparia Serigrafia Confecções Uniformes esportivos\n"
                        + "R. Des. Souto Maior, 57 - Centro, João Pessoa - PB, 58013-190\n"
                        + "Contato: (83) 98818-0754\n"
                        + "João Pessoa, Paraíba, Brasil\n"
                        + "Data da emissão: " + TimeForPDF + "\n"
                        + "Relatório gerado por sistemas: ALLGREEN LTDA"
                );
                empresaInfo.setAlignment(Element.ALIGN_RIGHT);
                empresaInfo.setFont(FontFactory.getFont(FontFactory.HELVETICA, 12));
                document.add(new Paragraph("\n"));
                document.add(empresaInfo);

                document.close();

                JOptionPane.showMessageDialog(null, "Nota fiscal do pedido gerada com sucesso!  ");

            } catch (DocumentException | HeadlessException | IOException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar nota fiscal do pedido: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void addContentToNotaFiscal(Document document, int idPedido) throws SQLException, DocumentException, BadElementException, IOException {
        Conection conexao = new Conection();
        String sql = "SELECT * FROM pedidos WHERE idpedidos = ?";
        conexao.conectar();
        try (Connection connection = conexao.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idPedido);
            try (ResultSet rs = stmt.executeQuery()) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                if (rs.next()) {
                    String nomeCliente = rs.getString("nomecliente");
                    String telefoneCliente = rs.getString("telefonecliente");
                    String endereco = rs.getString("endereco");
                    String precoUnitario = rs.getString("precounidade");
                    String quantidade = rs.getString("quantidade");
                    Date prazoEntrega = rs.getDate("prazoentrega");
                    String desconto = rs.getString("desconto");

                    // Adicione os detalhes da nota fiscal ao documento
                    Paragraph title = new Paragraph("Nota Fiscal - Pedido " + idPedido);
                    title.setAlignment(Element.ALIGN_CENTER);
                    title.setFont(FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD));
                    document.add(title);
                    document.add(new Paragraph("\n"));

                    // Detalhes do pedido
                    Paragraph clienteInfo = new Paragraph("Cliente: " + nomeCliente);
                    document.add(clienteInfo);

                    Paragraph enderecoInfo = new Paragraph("Endereço: " + endereco);
                    document.add(enderecoInfo);

                    Paragraph telefoneInfo = new Paragraph("Telefone: " + telefoneCliente);
                    document.add(telefoneInfo);

                    Paragraph precoInfo = new Paragraph("Preço por Unidade: " + precoUnitario);
                    document.add(precoInfo);

                    Paragraph quantidadeInfo = new Paragraph("Quantidade: " + quantidade);
                    document.add(quantidadeInfo);

                    Paragraph descontoInfo = new Paragraph("Desconto: " + desconto);
                    document.add(descontoInfo);

                    Paragraph prazoEntregaInfo = new Paragraph("Data de Entrega: " + sdf.format(prazoEntrega));
                    document.add(prazoEntregaInfo);
                    document.add(new Paragraph("\n"));

                    // Linha horizontal para separar os detalhes do pedido da seção da assinatura
                    LineSeparator lineSeparator = new LineSeparator();
                    document.add(lineSeparator);
                    document.add(new Paragraph("\n"));

                    // Adiciona a assinatura do responsável
                    Paragraph detalhesAssinatura = new Paragraph();
                    detalhesAssinatura.add("      Responsável:\nAilton Tomás Honorato                                                       Assinatura Cliente: \n");
                    detalhesAssinatura.add("CNPJ: 28.098.856/0001-60                                           ______________________\n\n\n\n\n");

                    detalhesAssinatura.setAlignment(Element.ALIGN_LEFT);
                    document.add(detalhesAssinatura);

                } else {
                    JOptionPane.showMessageDialog(null, "Pedido não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void gerarRelatorioAnual(String anoSelecionado) {
        String TimeForPDF = getCurrentDateTime();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvar Relatório de Pedidos por Ano");
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
            }

            try {
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                // Adicione o conteúdo do relatório ao documento PDF
                Paragraph title = new Paragraph("Relatório de pedidos do ano de " + anoSelecionado);
                title.setAlignment(Element.ALIGN_CENTER);
                // Alinha o texto ao centro ^
                title.setFont(FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLD));
                // Define a fonte, tamanho e estilo ^
                title.setSpacingAfter(20);
                // Define um espaço após o parágrafo ^
                document.add(title);
                // Adiciona o título ao documento ^
                document.add(new Paragraph("\n"));
                // Adiciona uma linha em branco ^

                // Obtenha os dados do banco de dados
                Map<Integer, Map<Integer, StringBuilder>> relatoriosPorID = obterDadosDoBanco(anoSelecionado);

                // Adicione os detalhes do relatório ao documento PDF
                for (int idPedido : relatoriosPorID.keySet()) {
                    Map<Integer, StringBuilder> relatorioPorMes = relatoriosPorID.get(idPedido);
                    for (int mes : relatorioPorMes.keySet()) {
                        document.add(new Paragraph("Mês: " + mes + "\n"));
                        document.add(new Paragraph(relatorioPorMes.get(mes).toString()));
                        document.add(new Paragraph("=================================================================="));
                    }
                }
                Paragraph total = new Paragraph("Caixa Total: " + String.format("%.2f", valor) + "\n\n\n");
                document.add(total);

                Paragraph empresaInfo = new Paragraph(
                        "Sericon - Estamparia Serigrafia Confecções Uniformes esportivos\n"
                        + "R. Des. Souto Maior, 57 - Centro, João Pessoa - PB, 58013-190\n"
                        + "Contato: (83) 98818-0754\n"
                        + "João Pessoa, Paraíba, Brasil\n"
                        + "Data da emissão: " + TimeForPDF + "\n"
                        + "Relatório gerado por sistemas: ALLGREEN LTDA"
                );
                empresaInfo.setAlignment(Element.ALIGN_RIGHT); // Alinha o texto à direita
                empresaInfo.setFont(FontFactory.getFont(FontFactory.HELVETICA, 12)); // Define a fonte e o tamanho
                document.add(new Paragraph("\n")); // Adiciona uma linha em branco antes do nome da empresa
                document.add(empresaInfo); // Adiciona o nome da empresa e o CNPJ ao final do documento
                document.close();

                JOptionPane.showMessageDialog(null, "Relatório de pedidos por ano gerado com sucesso!");

            } catch (DocumentException | IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar relatório de pedidos por ano: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static Map<Integer, Map<Integer, StringBuilder>> obterDadosDoBanco(String anoSelecionado) {
        Map<Integer, Map<Integer, StringBuilder>> relatoriosPorID = new HashMap<>();
        final double[] totalGeral = {0.0}; // Variável final para armazenar o total geral
        try {
            Conection conexao = new Conection();
            String sql = "SELECT * FROM pedidos WHERE YEAR(prazoentrega) = ? ORDER BY prazoentrega";
            conexao.conectar();
            try (Connection connection = conexao.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, anoSelecionado);
                try (ResultSet rs = stmt.executeQuery()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                    while (rs.next()) {
                        int idPedido = rs.getInt("idpedidos");
                        String nomeCliente = rs.getString("nomecliente");
                        String telefoneCliente = rs.getString("telefonecliente");
                        String endereco = rs.getString("endereco");
                        double precoUnitario = rs.getDouble("precounidade");
                        int quantidade = rs.getInt("quantidade");
                        Date prazoEntrega = rs.getDate("prazoentrega");
                        double desconto = rs.getDouble("desconto");

                        // Calcule o subtotal para este pedido
                        double subtotal = (precoUnitario * quantidade) * (1 - (desconto / 100));
                        totalGeral[0] += subtotal; // Adicione o subtotal ao total geral

                        // Obtém o mês da data de entrega
                        int mes = prazoEntrega.getMonth() + 1;

                        // Adiciona o pedido ao relatório do mês correspondente para este ID de pedido
                        Map<Integer, StringBuilder> relatorioPorMes = relatoriosPorID.getOrDefault(idPedido, new HashMap<>());
                        StringBuilder relatorioMes = relatorioPorMes.getOrDefault(mes, new StringBuilder());
                        relatorioMes.append("Nome do Cliente: ").append(nomeCliente).append("\n");
                        relatorioMes.append("Telefone do Cliente: ").append(telefoneCliente).append("\n");
                        relatorioMes.append("Endereço: ").append(endereco).append("\n");
                        relatorioMes.append("Preço por Unidade: ").append(String.format("%.2f", precoUnitario)).append("\n");
                        relatorioMes.append("Quantidade: ").append(quantidade).append("\n");
                        relatorioMes.append("Desconto: ").append(String.format("%.2f", desconto)).append("%\n");
                        relatorioMes.append("Data de Entrega: ").append(sdf.format(prazoEntrega)).append("\n");
                        relatorioMes.append("Subtotal: ").append(String.format("%.2f", subtotal)).append("\n\n");

                        relatorioPorMes.put(mes, relatorioMes);
                        relatoriosPorID.put(idPedido, relatorioPorMes);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter dados do banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        // Adicione o total geral ao final do relatório
        relatoriosPorID.forEach((idPedido, relatoriosPorMes) -> {
            relatoriosPorMes.forEach((mes, relatorioMes) -> {
            });
        });
        GeraRelatorios.valor = totalGeral[0];
        return relatoriosPorID;
    }

    public static void gerarRelatorioMensal(String mesSelecionado) {
        String TimeForPDF = getCurrentDateTime();
        Calendar cal = Calendar.getInstance();

        int mesAtual = obterNumeroMes(mesSelecionado);
        String mes = mesSelecionado;
        int anoAtual = cal.get(Calendar.YEAR);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvar Relatório de Pedidos por Mês");
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
            }

            try {
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                // Adicione o conteúdo do relatório ao documento PDF
                Paragraph titulo = new Paragraph("Relatório de pedidos do mês de " + mes + " de " + anoAtual);
                titulo.setAlignment(Element.ALIGN_CENTER); // Define o alinhamento como centralizado
                document.add(titulo);
                document.add(new Paragraph(""));
                document.add(new Paragraph("\n"));

                // Obtenha os dados do banco de dados
                Map<Integer, StringBuilder> relatorioPorMes = obterDadosDoBanco(anoAtual, mesAtual);

                // Adicione os detalhes do relatório ao documento PDF
                for (int dia : relatorioPorMes.keySet()) {
                    document.add(new Paragraph("Dia: " + dia));
                    document.add(new Paragraph(relatorioPorMes.get(dia).toString()));
                    document.add(new Paragraph("=================================================================="));
                }
                Paragraph total = new Paragraph("Caixa Total: " + String.format("%.2f", valor) + "\n\n\n");
                document.add(total);
                Paragraph empresaInfo = new Paragraph(
                        "Sericon - Estamparia Serigrafia Confecções Uniformes esportivos\n"
                        + "R. Des. Souto Maior, 57 - Centro, João Pessoa - PB, 58013-190\n"
                        + "Contato: (83) 98818-0754\n"
                        + "João Pessoa, Paraíba, Brasil\n"
                        + "Data da emissão: " + TimeForPDF + "\n"
                        + "Relatório gerado por sistemas: ALLGREEN LTDA"
                );
                empresaInfo.setAlignment(Element.ALIGN_RIGHT); // Alinha o texto à direita
                empresaInfo.setFont(FontFactory.getFont(FontFactory.HELVETICA, 12)); // Define a fonte e o tamanho
                document.add(new Paragraph("\n")); // Adiciona uma linha em branco antes do nome da empresa
                document.add(empresaInfo); // Adiciona o nome da empresa e o CNPJ ao final do documento

                document.close();

                JOptionPane.showMessageDialog(null, "Relatório de pedidos por mês gerado com sucesso!");

            } catch (DocumentException | IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar relatório de pedidos por mês: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static Map<Integer, StringBuilder> obterDadosDoBanco(int ano, int mes) {
        Map<Integer, StringBuilder> relatorioPorDia = new HashMap<>();
        final double[] totalGeral = {0.0}; // Variável final para armazenar o total geral

        try {
            Conection conexao = new Conection();
            String sql = "SELECT * FROM pedidos WHERE YEAR(prazoentrega) = ? AND MONTH(prazoentrega) = ?";
            conexao.conectar();
            try (Connection connection = conexao.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, ano);
                stmt.setInt(2, mes);
                try (ResultSet rs = stmt.executeQuery()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                    while (rs.next()) {
                        int idPedido = rs.getInt("idpedidos");
                        String nomeCliente = rs.getString("nomecliente");
                        String telefoneCliente = rs.getString("telefonecliente");
                        String endereco = rs.getString("endereco");
                        double precoUnitario = rs.getDouble("precounidade");
                        int quantidade = rs.getInt("quantidade");
                        Date prazoEntrega = rs.getDate("prazoentrega");
                        double desconto = rs.getDouble("desconto");

                        // Calcule o subtotal para este pedido
                        double subtotal = (precoUnitario * quantidade) * (1 - (desconto / 100));
                        totalGeral[0] += subtotal; // Adicione o subtotal ao total geral

                        // Obtém o dia da data de entrega
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(prazoEntrega);
                        int dia = cal.get(Calendar.DAY_OF_MONTH);

                        // Adiciona o pedido ao relatório do dia correspondente
                        StringBuilder relatorioDia = relatorioPorDia.getOrDefault(dia, new StringBuilder());
                        relatorioDia.append("Nome do Cliente: ").append(nomeCliente).append("\n");
                        relatorioDia.append("Telefone do Cliente: ").append(telefoneCliente).append("\n");
                        relatorioDia.append("Endereço: ").append(endereco).append("\n");
                        relatorioDia.append("Data de Entrega: ").append(sdf.format(prazoEntrega)).append("\n");
                        relatorioDia.append("Preço por Unidade: ").append(String.format("%.2f", precoUnitario)).append("\n");
                        relatorioDia.append("Quantidade: ").append(quantidade).append("\n");
                        relatorioDia.append("Desconto: ").append(String.format("%.2f", desconto)).append("%\n");
                        relatorioDia.append("Subtotal: ").append(String.format("%.2f", subtotal)).append("\n\n");
                        relatorioPorDia.put(dia, relatorioDia);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao obter dados do banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        GeraRelatorios.valor = totalGeral[0];
        return relatorioPorDia;
    }

    private static int obterNumeroMes(String mesSelecionado) {
        return switch (mesSelecionado) {
            case "Janeiro" ->
                1;
            case "Fevereiro" ->
                2;
            case "Março" ->
                3;
            case "Abril" ->
                4;
            case "Maio" ->
                5;
            case "Junho" ->
                6;
            case "Julho" ->
                7;
            case "Agosto" ->
                8;
            case "Setembro" ->
                9;
            case "Outubro" ->
                10;
            case "Novembro" ->
                11;
            case "Dezembro" ->
                12;
            default ->
                1;
        }; // Valor padrão (Janeiro) se o nome do mês não for reconhecido
    }

    public static String getCurrentDateTime() {
        // Obter a data e hora atuais
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Formatar a data e hora como string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }

}
