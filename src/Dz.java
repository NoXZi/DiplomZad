
/**
 * Created by AlexV on 16.09.2016.
 */
import java.util.*;

public class Dz {
    public static void main(String[] argv) {
        String[] actor = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] replica = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор? Аммос Федерович, как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        String result = "";
        String result1 = "";
        String str="";
        Integer num;
        for (int i = 0; i < actor.length; i++) {
               result += actor[i] + "\n";
            }
        System.out.println("Роли: " + "\n" + result);
        for (int i = 0; i < replica.length; i++) {
            result1 += replica[i] + "\n";

        }
        System.out.println("Реплики: " + "\n" + result1);
        System.out.println("Преобразование: " + "\n");



        try {
            for (int i = 0; i < actor.length; i++) {

                List<String> words1 = searchFromStart(replica, actor[i]);
                System.out.print("\n"+ actor[i] +":"+ "\n");
               for (int j=0; j<words1.size(); j++){
                   System.out.print( words1.get(j).toString());
               }
            }
        } catch (IndexOutOfBoundsException e)
    {
        }

    }

    public static ArrayList<String> searchFromStart(String[] inputArray, String searchText) {
        ArrayList<String> outputArray = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (searchText.compareToIgnoreCase(inputArray[i].substring(0,
                    searchText.length())) == 0) {


                outputArray.add((i+1)+")" + inputArray[i].replaceAll(searchText+":", "")+ "\n");

            }
        }
        return outputArray;
    }



}

