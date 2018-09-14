public class fazenda{
public static void main(String arg[]){

fazendeiro f1 = new fazendeiro("lucas","fazendeiro");
System.out.println("welcome "+f1.getNome()+" vc e do tipo:"+f1.getTipo());

pessoa p1 = new pessoa();

remove rem = new remove();
System.out.println("objeto a ser removido:"+rem.obj(f1).getNome());
System.out.println(rem.retorno(f1)=="pessoa"?"bom":"ruim");
System.out.println(rem.retorno(f1));
//flr(p1);
flr(f1);
}
public static void flr(Object ob){
    String classe=ob.getClass().getName();
    if(classe!=null){
        fazendeiro ob2=new fazendeiro();
System.out.println("objeto1:"+ob);
System.out.println("objeto2:"+ob2);
    }
System.out.println("objeto3:"+classe);

    }
}
