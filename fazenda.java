public class fazenda{
public static void main(String arg[]){
pessoa p1 = new pessoa("fazendeiro");
//pessoa p1 = new pessoa();

//animal a1 = new animal("cachorro");

cachorro c1 = new cachorro("cao");
//c1.setTipo("cachorro");

methods mt=new methods();
fazendeiro f1 = new fazendeiro();

System.out.println("welcome "+p1.getTipo());
System.out.println("animal registrado:"+c1.getTipo());
System.out.println(mt.getTalk(c1));
//System.out.println(f1.getTipo());
//System.out.println(a1.getClass().getName());
}
}
