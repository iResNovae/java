
abstract class Human {
int age;
String name;
int health = 100;
int tired = 0;

abstract protected void Live(); {
	health -= 10;
	tired += 10;
}
}
