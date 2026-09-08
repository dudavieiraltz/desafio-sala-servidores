import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GerenciadorAcessoTest {

    @Test
    void deveConcederAcessoParaTecnicoAsOitoHoras() {

        Funcionario funcionario = new Funcionario(
            "Carlos",
            "Técnico de Infraestrutura",
            8
        );

        boolean resultado = GerenciadorAcesso.verificarAcesso(funcionario);

        assertTrue(resultado);
    }

    @Test
    void deveNegarAcessoParaTecnicoAsSeisHoras() {

        Funcionario funcionario = new Funcionario(
            "Rafael",
            "Técnico de Infraestrutura",
            6
        );

        boolean resultado = GerenciadorAcesso.verificarAcesso(funcionario);

        assertFalse(resultado);
    }

    @Test
    void deveConcederAcessoAsSeteHoras() {

        Funcionario funcionario = new Funcionario(
            "Lucas",
            "Técnico de Infraestrutura",
            7
        );

        boolean resultado = GerenciadorAcesso.verificarAcesso(funcionario);

        assertTrue(resultado);
    }

    @Test
    void deveConcederAcessoAoAdministradorAsDezenoveHoras() {

        Funcionario funcionario = new Funcionario(
            "Fernanda",
            "Administrador de Sistemas",
            19
        );

        boolean resultado = GerenciadorAcesso.verificarAcesso(funcionario);

        assertTrue(resultado);
    }

    @Test
    void deveNegarAcessoAsVinteHoras() {

        Funcionario funcionario = new Funcionario(
            "Mariana",
            "Técnico de Infraestrutura",
            20
        );

        boolean resultado = GerenciadorAcesso.verificarAcesso(funcionario);

        assertFalse(resultado);
    }

    @Test
    void deveNegarAcessoParaFuncionarioBloqueado() {

        Funcionario funcionario = new Funcionario(
            "João",
            "Técnico de Infraestrutura",
            10
        );

        boolean resultado = GerenciadorAcesso.verificarAcesso(funcionario);

        assertFalse(resultado);
    }

    @Test
    void deveConcederAcessoParaAdministradorAsDezHoras() {

        Funcionario funcionario = new Funcionario(
            "Lucas",
            "Administrador de Sistemas",
            10
        );

        boolean resultado = GerenciadorAcesso.verificarAcesso(funcionario);

        assertTrue(resultado);
    }

    @Test
    void deveNegarAcessoParaCargoNaoPermitido() {

        Funcionario funcionario = new Funcionario(
            "Beatriz",
            "Desenvolvedora",
            10
        );

        boolean resultado = GerenciadorAcesso.verificarAcesso(funcionario);

        assertFalse(resultado);
    }

    @Test
    void deveNegarAcessoQuandoFuncionarioEstiverBloqueadoComOutrasRegrasInvalidas() {

        Funcionario funcionario = new Funcionario(
            "Maria",
            "Desenvolvedora",
            20
        );

        boolean resultado = GerenciadorAcesso.verificarAcesso(funcionario);

        assertFalse(resultado);
    }
}