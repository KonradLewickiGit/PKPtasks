public class Zadanie2 {
    /*
    ZADANIE 2
    Złożoność obliczeniowa tego algorytmu wyszukiwania wynosiła bedzie O(log2 n) dla tablicy posiadajacej 1024 elementy zlozonosc ta bedzie wynosila 10
    Złożoność panięciowa jest stała i rowna O(1)
     */


    private boolean search(int[] numbers, int x){
        int l=0, r=numbers.length-1, center;
        while(l<=r)
        {
            center=(l+r)/2;
            if (numbers[center] == x)
                return true;
            else if (numbers[center]>x)
                l=center+1;
            else
                r = center - 1;
        }
        return false;
    }
}
