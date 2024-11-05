# Exercício 1.0

## Polimofismo Tempo de Compilação x Execução

O **polimorfismo em tempo de compilação** ocorre quando a seleção do método ocorre durante a compilação. Ele é chamado de "estático" porque o compilador decide qual método chamar antes da execução. O exemplo mais comum é a sobrecarga de métodos, onde métodos com o mesmo nome têm assinaturas diferentes (parâmetros distintos).

        class Calculator {
            // Sobrecarga do método add para diferentes tipos de parâmetros
            public int add(int a, int b) {
                return a + b;
            }

            public double add(double a, double b) {
                return a + b;
            }

            public int add(int a, int b, int c) {
                return a + b + c;
            }
        }

        public class TestPolymorphism {
            public static void main(String[] args) {
                Calculator calculator = new Calculator();
                System.out.println(calculator.add(5, 10));       // Chama add(int, int)
                System.out.println(calculator.add(5.5, 10.5));   // Chama add(double, double)
                System.out.println(calculator.add(5, 10, 15));   // Chama add(int, int, int)
            }
        }
<br>

O **polimorfismo em tempo de execução** ocorre quando a seleção do método apropriado é feita durante a execução do programa, com base no tipo real do objeto. Esse tipo de polimorfismo é chamado de "dinâmico" porque a seleção do método é decidida em tempo de execução. A sobrescrita de métodos em uma hierarquia de herança é o exemplo mais comum.

        class Vehicle {
            public void move() {
                System.out.println("Vehicle is moving");
            }
        }

        class Car extends Vehicle {
            @Override
            public void move() {
                System.out.println("Car is driving");
            }
        }

        class Bike extends Vehicle {
            @Override
            public void move() {
                System.out.println("Bike is pedaling");
            }
        }

        public class TestDynamicPolymorphism {
            public static void main(String[] args) {
                Vehicle myVehicle = new Car(); // Polimorfismo dinâmico
                myVehicle.move();              // Chama move() de Car

                myVehicle = new Bike();        // Reatribuição para Bike
                myVehicle.move();              // Chama move() de Bike
            }
        }
