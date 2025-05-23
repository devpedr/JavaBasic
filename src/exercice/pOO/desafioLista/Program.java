/*Fazer um programa para ler um numero inteiro N e depois os dados(id,nome e salario) de
* N funcionarios.Nao deve haver repeticao de id.
*
* Em seguida, efeturar o aumento de X por cento no salario de um determiado funcionario.Para isso, o programa
* deve ler um id e o valor X. Se o id informado nao existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar
* a listagem atualizada dos funcionario, conforme exemplo,
*
* Lembre-se de aplicar a tecnica de encapsulamento para nao permitir que o salario possa ser mudado livremente. Um salario so pode ser aumentado com base em uma operacao de aumetno
* por porcentagem dada.*/

package src.exercice.pOO.desafioLista;

import src.exercice.pOO.desafioLista.Entites.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("How many employees will be registered = ");
        int n = sc.nextInt();

        List<Employee> employee = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmplyoee #" + (i+1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id,name,salary);
            employee.add(emp);
        }

            System.out.print("Employee the employee id that will have salary increase: ");
            Integer idToIncrease = sc.nextInt();

            // Filtragem compara o valor de idToincrease com o id da lista existente, caso for verdadeiro ele vai ser diferente de null
            Employee findEmp = employee.stream().filter(x -> x.getId() == idToIncrease).findFirst().orElse(null);

            if (idToIncrease == null) {
                System.out.println("This id does not exist!");

            } else {
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                findEmp.increaseSalary(percentage);
                }
                System.out.println("List of employees: ");
                for (Employee x : employee) {
                System.out.println(x);
            }
                sc.close();

        }
    }


