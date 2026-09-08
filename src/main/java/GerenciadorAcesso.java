import java.util.ArrayList;
import java.util.List;

public class GerenciadorAcesso {

    private static final List<String> listaBloqueio = new ArrayList<>();

    static {
        listaBloqueio.add("João");
        listaBloqueio.add("Maria");
    }

    public static void main(String[] args) {

        List<Funcionario> solicitacoes = new ArrayList<>();

        solicitacoes.add(
            new Funcionario(
                "Carlos",
                "Técnico de Infraestrutura",
                8
            )
        );

        solicitacoes.add(
            new Funcionario(
                "Ana",
                "Administrador de Sistemas",
                18
            )
        );

        solicitacoes.add(
            new Funcionario(
                "João",
                "Desenvolvedor",
                10
            )
        );

        solicitacoes.add(
            new Funcionario(
                "Pedro",
                "Técnico de Infraestrutura",
                20
            )
        );

        for (Funcionario funcionario : solicitacoes) {
            verificarAcesso(funcionario);
        }
    }

    public static boolean verificarAcesso(Funcionario funcionario) {

        if (!listaBloqueio.contains(funcionario.nome)) {

            if (funcionario.cargo.equals("Técnico de Infraestrutura")
                    || funcionario.cargo.equals("Administrador de Sistemas")) {

                if (funcionario.horarioEntrada >= 7
                        && funcionario.horarioEntrada <= 19) {

                    System.out.println(
                        "Acesso concedido a " + funcionario.nome
                    );

                    return true;

                } else {

                    System.out.println(
                        "Acesso negado a " + funcionario.nome
                    );

                    System.out.println(
                        " - Horário de entrada fora do permitido."
                    );

                    return false;
                }

            } else {

                System.out.println(
                    "Acesso negado a " + funcionario.nome
                );

                System.out.println(
                    " - Cargo não permitido."
                );

                return false;
            }

        } else {

            System.out.println(
                "Acesso negado a " + funcionario.nome
            );

            System.out.println(
                " - Funcionário está na lista de bloqueio."
            );

            return false;
        }
    }
}