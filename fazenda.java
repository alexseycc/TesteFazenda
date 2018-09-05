public class fazenda{
public static void main(String arg[]){

fazendeiro f1 = new fazendeiro("lucas","fazendeiro");
System.out.println("welcome "+f1.getNome()+" vc e do tipo:"+f1.getTipo());

pessoa p1 = new pessoa();

remove rem = new remove();
System.out.println("objeto a ser removido:"+rem.obj(f1).getNome());
System.out.println(rem.retorno(f1)=="pessoa"?"bom":"ruim");
System.out.println(rem.retorno(f1));

}
}
