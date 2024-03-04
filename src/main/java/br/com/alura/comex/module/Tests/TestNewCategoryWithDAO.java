package br.com.alura.comex.module.Tests;

import br.com.alura.comex.module.Classes.Category;
import br.com.alura.comex.module.Classes.ConnectionWithDB.ServiceWithCategories.ServiceCategory;

import java.util.Scanner;

public class TestNewCategoryWithDAO {
    static ServiceCategory saTest = new ServiceCategory();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                Qual função gostaria de realizar:
                1 - Criar categoria
                2 - Listar categoria(s)
                3 - Alterar nome da categoria
                4 - Alterar descrição da categoria
                5 - Deletar categoria
                """);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                openCategory();
                break;
            case 2:
                listCategories();
                break;
            case 3:
                alterNameCategory();
                break;
            case 4:
                alterDescriptionCategory();
                break;
            case 5:
                deleteCategory();
                break;
        }
    }

    private static void openCategory () {
        System.out.println("Digite nome da categoria:");
        String categoryName = scanner.next();
        System.out.println("Digite a descrição da categoria:");
        String categoryDescription = scanner.next();

        saTest.openCategory(new Category(categoryName, categoryDescription));
        System.out.println("Categoria criada com sucesso!");
    }

    private static void listCategories () {
        System.out.println("Categorias cadastradas:");
        var categorylist = saTest.showCategory();
        categorylist.stream().forEach(System.out::println);
    }

    private static void alterNameCategory () {
        System.out.println("Digite o id da categoria:");
        int idAccount = scanner.nextInt();

        System.out.println("Digite o nome da categoria a ser alterado:");
        String name = scanner.nextLine();

        saTest.alterName(idAccount, name);
    }

    private static void alterDescriptionCategory () {
        System.out.println("Digite o id da categoria:");
        int idAccount = scanner.nextInt();

        System.out.println("Digite a descrição da categoria a ser alterado:");
        String description = scanner.nextLine();

        saTest.alterDescription(idAccount, description);
    }

    private static void deleteCategory () {
        System.out.println("Digite o nome da categoria que quer excluir:");
        var nameCategory = scanner.nextLine();

        saTest.deleteCategory(nameCategory);
    }
}
