package org.example.app;

import static org.junit.jupiter.api.Assertions.*; //PARA NO TENER QUE ESCRIBIR LA PALABRA ASSERTIONS
// , COLOCAMOS EL STATIC Y EL .*

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


public class ExampleTest {

    //IMPORTANTE!! POR DEFECTO TODOS LOS TEST DAN OK

    private Example example;
    @BeforeEach
    public void init(){
      this.example = new Example();
    }

    @Test
    public void sumarTest(){

       //GIVEN - TENIENDO  (EN ESTE PASO CREAMOS LOS PARAMETROS Y OBJETOS NECESARIOS PARA EJECUTAR EL METODO)


        int numberA = 3;
        int numberB = 3;

        //WHEN  - CUANDO (HACEMOS LA LLAMADA AL METODO A TESTEAR Y EL RESULTADO SERA EL VALOR ACTUAL)

        int res = this.example.sumar(numberA,numberB);

        //THEN - ENTONCES  (HACEMOS LAS VALIDACIONES QUE NECESITEMOS A TRAVES DE LOS DISTINTOS ASSERTIONS)

        assertEquals(6, res);
        assertInstanceOf(Integer.class, res);





    }


    @Test
    public void testCheckPositivo(){

        //GIVEN


        int number = 10;

        //WHEN

        boolean res = this.example.checkPositivo(number);

        //THEN

        assertTrue(res);



    }


    @Test
    public void testCheckPositivoError(){

        //GIVEN

        int number = -10;

        //THEN

        assertThrows(IllegalArgumentException.class,()->{
            this.example.checkPositivo(number);
        });



    }


    @Test
    public void testContarLetrasA(){

        //GIVEN

        String cadena = "abracadabra";

        //WHEN
        int res = this.example.contarLetrasA(cadena);

        //THEN
        assertEquals(5,res);




    }



    @Test
    public void testContieneElemento(){

        //GIVEN
        List<String> paises = List.of("Colombia","Argentina","uruguay");
        String pais = "Argentina";

        //WHEN
        boolean res = this.example.contieneElemento(paises,pais);

        //THEN
        assertTrue(res);



    }


    @Test
    public void testRevertirCadena(){

        //given
        String cadena = "paja";
        //when
       String res = this.example.revertirCadena(cadena);
       //then
    assertEquals("ajap",res);




}


    @Test
    public void testFactorial(){
        //GIVEN
        int number = 6;
        //WHEN
        long res = this.example.factorial(number);
        //THEN
        assertEquals(720L,res);


    }


    @Test
    public void testFactorialError(){
        //GIVEN
        int number = -6;
        //WHEN - THEN
        assertThrows(IllegalArgumentException.class, ()->{
            this.example.factorial(number);
        });
    }


    @Test
    public void testEsPrimo(){

        //GIVEN
        int number = 3;

        //WHEN
        boolean res = this.example.esPrimo(number);

        //THEN
        assertTrue(res);

    }
    @Test
    public void testEsPrimoMayorACuatro(){

        //GIVEN
        int number = 7;

        //WHEN
        boolean res = this.example.esPrimo(number);

        //THEN
        assertTrue(res);

    }
    @Test
    public void testEsPrimoMenorQueUno(){
        //GIVEN
        int number = 1;
        //WHEN
        boolean res = this.example.esPrimo(number);
        //THEN
        assertFalse(res);

    }

    @Test
    public void testNoEsPrimo(){
        //GIVEN
        int number = 8;
        //WHEN
        boolean res = this.example.esPrimo(number);
        //THEN
        assertFalse(res);

    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {

        //WHEN
        String res = this.example.mensajeConRetraso();
        //THEN
        assertEquals("Listo después de retraso", res);

    }


    @Test
    public void testConvertirAString(){
        //GIVEN
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        //WHEN
        List<String> stringList = this.example.convertirAString(numbers);
        //THEN
        assertEquals(List.of("1","2","3","4","5","6","7","8","9","10"), stringList);


    }

    @Test
    public void testCalcularMedia(){
        //GIVEN
        List<Integer> list = List.of(4,5,7,8);
       //WHEN
    Double res = this.example.calcularMedia(list);

       //THEN
    assertEquals(6.0,res);
}

    @Test
    public void testCalcularMediaListaVacia(){
        //GIVEN
        List<Integer> list = List.of();


        //THEN
        assertThrows(IllegalArgumentException.class, ()->{
            this.example.calcularMedia(list);
        });
    }

    @Test
    public void testCalcularMediaListaNull(){
        //GIVEN
        List<Integer> list = null;


        //THEN
        assertThrows(IllegalArgumentException.class, ()->{
            this.example.calcularMedia(list);
        });
    }

    @Test
    public void testConvertirListaAMayuscula(){
        //GIVEN
        List<String> list = List.of("pepe","cacho","titi");
        //WHEN
        String stringUpper = this.example.convertirListaAMayuscula(list);
        //THEN
        assertEquals("PEPE,CACHO,TITI",stringUpper);


    }







}
