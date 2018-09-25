package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.SaqueExceptions;

public class Saque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Número conta: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome usuário: ");
			String holder = sc.nextLine();
			System.out.print("Saldo Inicial: ");
			double balance = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double withDrawLimit = sc.nextDouble();

			Account conta = new Account(number, holder, balance, withDrawLimit);

			System.out.println();
			System.out.println("-------DADOS DA CONTA-------");
			System.out.println(conta);

			System.out.print("Valor para saque: ");
			double amount = sc.nextInt();

			conta.withDraw(amount);

			System.out.println();
			System.out.println("-------DADOS ATUALIZADOS-------");
			System.out.println(conta);

		} catch (SaqueExceptions e) {
			System.out.println("Erro ao sacar: " + e.getMessage());
		}

		catch (RuntimeException e) {
			System.out.println("Erro desconhecido!" + e.getMessage());
		}

		sc.close();

	}

}
