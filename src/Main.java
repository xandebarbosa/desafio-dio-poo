import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java básico");
        curso1.setDescricao("Curso básico de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java POO");
        curso2.setDescricao("Curso POO de Java");
        curso2.setCargaHoraria(7);

        //System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descrição da mentoria em Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("-------- Dev 1 ---------");
        Dev dev = new Dev();
        dev.setNome("Alexandre");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());

        System.out.println("-------- Dev 2 ---------");
        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());
    }
}