/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        cliente j = new cliente();
        clscliente a = new clscliente ();
   
       j.setNombre("Josias");
       j.setApelllido("Alcantara");
       j.setSexo("M");
       j.setEdad(18);
       j.setDni(71553114);
       
      
        System.out.println("Nombre:"+j.getNombre()+"\t"+" Apellido:"+j.getApelllido()+"\n"+"Edad:"+j.getEdad()+"\t"+"DNI:"+j.getDni()+"\t"+"Sexo:"+j.getSexo());
        
        a.buscar();
        a.comprar();
        a.pagar();
        
    }

    
    
}
