package midia;

public class Principal {
    public static void main(String[] args) {
        Boy b[] = new Boy[2];
        Video v[] = new Video[3];
        Visualizacao vls = new Visualizacao(b[0], v[2]);

        v[0] = new Video("HTML5");
        v[1] = new Video("CSS");
        v[2] = new Video("JAVASCRIPT");
        b[0] = new Boy("Creuza", 18,"F", "creuzita");
        b[1] = new Boy("Marcelo", 28,"M", "marcelito");


        System.out.println(vls.toString());

        /*


        System.out.println("============Videos========");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("===========Boys=======");
        System.out.println(b[0].toString());
        System.out.println(b[1].toString());*/
    }
}
