public class fazenda{
public static void main(String arg[]){
//pessoa p1 = new pessoa("fazendeiro","lucas");
pessoa p1 = new pessoa();
p1.setNome("lucas");

//animal a1 = new animal("cachorro");
cachorro c1 = new cachorro("cao");
//c1.setTipo("cachorro");
c1.setNome("john");
methods mt=new methods();

fazendeiro f1 = new fazendeiro();
f1.setNome("luan");
parceiros pr=new parceiros();

//System.out.println("welcome "+p1.getTipo());
System.out.println("animal registrado:"+c1.getTipo());
System.out.println(mt.getTalk(c1));
System.out.println("welcome "+f1.getNome());
System.out.println("vc é do tipo "+mt.getTalk(c1));
//System.out.println(a1.getClass().getName());
//pr.getNome(c1);
System.out.println("parceiros:"+c1.getTipo());
System.out.println("parceiros:"+c1.getNome());



//System.out.println("Instancias:"+pr.getInstance(p1).toString());
pr.imp(c1);
//add ad = new add();
//System.out.println("objeto add"+ad.getNome());

remove rem = new remove();
rem.imp(p1);
System.out.println("tipo de obj:"+rem.obj(p1).getNome());
System.out.println("retorno de obj universal:"+rem.retorno(p1));
rem.retorno(p1).getTipo();
}
}
