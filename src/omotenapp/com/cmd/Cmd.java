package omotenapp.com.cmd;

public class Cmd {

	public static void main(String[] args) {
		
        System.out.println("Vai Corinthians!!");
        
        People p1 = new People(); // Criando objeto a partir da classe People
        People p2 = new People();
        
        p1.setName("Pedro Silva");
        p1.setEmail("pedro.silva@omotenapp.com");
        
        p2.setName("Maria Pereira");
        p2.setEmail("maria.pereira@omotenapp.com");

        System.out.println(p1.getName());
        System.out.println(p2.getEmail());
        
        System.out.println(p1);
        System.out.println(p2);
        
        String nome = p1.getName();
        
        System.out.println(nome + " - " + nome.length() + " - " + nome.toUpperCase());
        
        p1.endereco = "Rua Sem saída, 1000";
        
        System.out.println(p1.endereco);
        
        int i = 10;
        float f = 1.2f;
        
        Integer i2 = 33;
        Float f2 = 23.5f;
        
       
        
       
        
        
	}

}

