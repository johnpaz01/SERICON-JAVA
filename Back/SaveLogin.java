package Back;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SaveLogin {

    // Variáveis estáticas para armazenar os dados de login
    public static String login;
    public static String senha;
    public static boolean isTrue;

    // Método para salvar o login em um arquivo txt
    public static void salvarLogin(String login) {
        criarDiretoriosSeNecessario(); // Certifica-se de que os diretórios necessários existam
        salvarTextoNoArquivo("dados/don't alter/login.txt", login); // Salva o login no arquivo
        SaveLogin.login = login; // Atualiza a variável estática
    }

    // Método para salvar a senha em um arquivo txt
    public static void salvarSenha(String senha) {
        criarDiretoriosSeNecessario(); // Certifica-se de que os diretórios necessários existam
        salvarTextoNoArquivo("dados/don't alter/senha.txt", senha); // Salva a senha no arquivo
        SaveLogin.senha = senha; // Atualiza a variável estática
    }

    // Método para salvar um valor booleano em um arquivo txt
    public static void salvarBoolean(boolean valor) {
        criarDiretoriosSeNecessario(); // Certifica-se de que os diretórios necessários existam
        salvarTextoNoArquivo("dados/don't alter/boolean.txt", String.valueOf(valor)); // Salva o booleano no arquivo
        SaveLogin.isTrue = valor; // Atualiza a variável estática
    }

    // Método para salvar texto em um arquivo
    private static void salvarTextoNoArquivo(String caminhoArquivo, String texto) {
        try {
            FileWriter writer = new FileWriter(caminhoArquivo);
            writer.write(texto);
            writer.close();
            System.out.println("Texto salvo com sucesso em " + caminhoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o texto em " + caminhoArquivo + ": " + e.getMessage());
        }
    }

    // Método para criar diretórios se não existirem
    private static void criarDiretoriosSeNecessario() {
        String diretorioPrincipal = "dados/don't alter";
        File diretorio = new File(diretorioPrincipal);
        if (!diretorio.exists()) {
            if (diretorio.mkdirs()) {
                System.out.println("Diretórios criados com sucesso.");
            } else {
                System.out.println("Falha ao criar diretórios.");
            }
        }
    }

    // Método para carregar os dados de login
    public static void carregarDadosLogin() {
        try {
            BufferedReader loginReader = new BufferedReader(new FileReader("dados/don't alter/login.txt"));
            login = loginReader.readLine();
            loginReader.close();

            BufferedReader senhaReader = new BufferedReader(new FileReader("dados/don't alter/senha.txt"));
            senha = senhaReader.readLine();
            senhaReader.close();

            BufferedReader booleanReader = new BufferedReader(new FileReader("dados/don't alter/boolean.txt"));
            String booleanString = booleanReader.readLine();
            isTrue = Boolean.parseBoolean(booleanString);
            booleanReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados de login: " + e.getMessage());
        }
    }
}
