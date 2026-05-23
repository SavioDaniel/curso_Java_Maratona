package OExcecoes2.TryCatch;
import java.sql.SQLException;
import java.io.FileNotFoundException;
public class Ex08_OperadorSistema {

    public static void main(String[] args){
        int codigoStatus = 500; // Simulando um código de status de erro
        try {
            execultarBackup(codigoStatus);
        } catch (SQLException e) {
            System.out.println("Erro de banco de dados: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Erro de arquivo: " + e.getMessage());
        }
    }

    public static void execultarBackup(int codigoStatus) throws SQLException, FileNotFoundException{
        if (codigoStatus == 500){
            throw new SQLException("Banco de dados fora do ar!");
        } else if (codigoStatus == 404) {
            throw new FileNotFoundException("Arquivo de backup não encontrado no diretório!");
        }
    }
}
