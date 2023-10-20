import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // коэффициенты хранятся в обратном порядке, т. е. 8x3 + 6x2 + 5x + 12
        Integer[] array1 = new Integer[] {12, 5, 6, 8};
        Integer[] array2 = new Integer[] {-4, 8, 65, 0, 1};

        List<Integer> k1 = new ArrayList<>(List.of(array1));
        List<Integer> k2 = new ArrayList<>(List.of(array2));

        System.out.println(k1);
        System.out.println(k2);

        List<Integer> k3 = new ArrayList<>();

        for (int i = 0; i < k1.size(); i++)
        {
            for (int j = 0; j < k2.size(); j++)
            {
                int power = i + j;

                if (k3.size() > power)
                    k3.set(power, k3.get(power) + k1.get(i) * k2.get(j));
                else
                    k3.add(power, k1.get(i) * k2.get(j));
            }
        }

        System.out.println("Список коэффициентов после перемножения (в обратном порядке): " + k3);
    }
}