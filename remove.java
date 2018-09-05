class remove extends pessoa {
    

public void imp(pessoa p1){
    System.out.println("objeto a ser removido"+p1.getNome());
}
public pessoa obj(pessoa p1){
return p1;
}
public String getNome(){
    
return nome;
}

public String retorno(Object ob){
String classe=ob.getClass().getName();
return classe;
}
}
