package org.shubham;
import java.util.*;
import java.util.stream.Stream;


public class StreamApi {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(4,3,2,5,6,7);
        //This convert the array to the stream of integer elements
        Stream<Integer> arrStream = arr.stream();
        // Stream one used then can not be use after it like in line 15 after this we can not use the
        // stream arrStream if we want to use it again then we need to re initialize it or
        // else we will get the error Stream has already been linked or consumed
        arrStream.forEach(System.out::println);
        System.out.println("..................");
        // we can use multiple method in a single line also
        //1) To sort the values in a stream
        Stream<Integer>arrStream1= arr.stream();
        arrStream1.sorted().forEach(System.out::println);
        System.out.println("..................");
        //2) To filter the even element , sort it and then print each element
        // 3 times stream is created after each creation of stream other stream is overlap
        arr.stream().filter(n->n%2==0).sorted().forEach(ele-> System.out.println(ele));
        System.out.println("..................");
        //3) To filter the odd element , find there sum
        int sum_of_array= arr.stream()
                .filter(n->n%2!=0)
                .reduce(0,Integer::sum);
        System.out.println(sum_of_array);

    }
}