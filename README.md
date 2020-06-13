Втора лабораториска вежба по Софтверско инженерство

Марко Гелев, бр. на индекс 181580
Група на код:
Ја добив групата на код 4

Control Flow Graph
[![Screenshot-2020-06-13-at-19-21-40.png](https://i.postimg.cc/ZnSsC5SF/Screenshot-2020-06-13-at-19-21-40.png)](https://postimg.cc/vg0tKMDc)

Цикломатска комплексност
Цикломатска комплексност на овој код се добива со одземање на бројот на јазли 13, од бројот на ребра, кој е 19, и на добиениот број му се додава 2, односно 19 - 13 + 2 = 8

Тест случаи според критериумот Multiple condition
[![mcK.png](https://i.postimg.cc/cHBYsx4n/mcK.png)](https://postimg.cc/Vr55gctf)

Тест случаи според критериумот Every path
[![mitko.png](https://i.postimg.cc/m2qZqvNN/mitko.png)](https://postimg.cc/WhGPqfyh)

Објаснување на напишаните unit tests

 public void MultipleConditionTest() {
        assertFalse(SILab2.function(new User(null,null,"mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User(null,"mitko123","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("mitko","mitko123","mitkoMitkovski@yahoo.com"),allUsers));
        assertTrue(SILab2.function(new User("Mitko","MileZastita123@","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("Mitko","Milezastita123","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("Mitko","Milezastitabrojka","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("Mitko","Milezastitabroj@","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("Mitko","milezastitabroj@","mitkoMitkovski@yahoo.com"),allUsers));;
    }
	
	Според претходно направанета табела за Multiple Condition критериумот се пополнети соодветно assertFalse i assertTrue функциите
	со цел да се провери дали табелата и програмата се функционални. Од сите случаи само во еден е точно таму каде што вистинитосната табела
	за сите if проверки е вистинита.
	
	 public void EveryPathTest()
    {
        assertTrue(SILab2.function(new User("mitko","mileZastita123!","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User(null,null,"mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User(null,"mileZastita123!","mitkoMitkovski@yahoo.com"),allUsers));
        assertFalse(SILab2.function(new User("mitko","mileZastita1","mitkoMitkovski@yahoo.com"),allUsers));
    }
	
	Со оваа функција се проверува дали Every Path табелата која беше направена е валидна. Само 1 случај дава вистинит исто како
	кај табелата. 
