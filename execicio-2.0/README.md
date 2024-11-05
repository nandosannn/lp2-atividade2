# Exercício 2

Explique com suas palavras a diferença entre herança, composição e agregação. Crie um exemplo de cada em Java e inclua numa pasta separada assim como fez com os exercícios da lista.

## Herança

A herança representa uma relação "é-um" entre classes. Quando uma classe herda de outra, ela ganha todos os métodos e atributos da classe pai, permitindo que os reutilize e até que sobrescreva métodos para um comportamento específico.

        // Classe base ou superclasse
        class Animal {
            public void eat() {
                System.out.println("Animal is eating");
            }
        }

        // Subclasse que herda de Animal
        class Dog extends Animal {
            @Override
            public void eat() {
                System.out.println("Dog is eating");
            }

            public void bark() {
                System.out.println("Dog barks");
            }
        }

## Composição

A composição é uma relação "tem-um", onde uma classe contém outra como parte de sua estrutura. Se a classe principal for destruída, seus componentes geralmente também são, pois fazem parte dela.

    // Classe Motor
    class Motor {
        public void start() {
            System.out.println("Motor started");
        }
    }

    // Classe Carro que contém Motor
    class Car {
        private Motor motor;

        public Car() {
            motor = new Motor(); // Car cria e contém um Motor
        }

        public void startCar() {
            motor.start();
            System.out.println("Car is moving");
        }
    }

## Agregação

A agregação também é uma relação "tem-um", mas mais fraca do que a composição. Aqui, uma classe contém outra, mas a classe "contida" pode existir independentemente.

    // Classe Estudante
    class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Classe SalaDeAula que agrega Estudante
    class Classroom {
        private List<Student> students;

        public Classroom() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student); // Agregação: sala de aula contém estudantes
        }

        public void listStudents() {
            for (Student s : students) {
                System.out.println(s.getName());
            }
        }
    }

No exemplo, Classroom agrega Student, mas Student pode existir fora de Classroom. Ou seja, Student não depende de Classroom para existir.