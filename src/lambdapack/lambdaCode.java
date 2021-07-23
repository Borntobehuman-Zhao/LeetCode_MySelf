package lambdapack;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author zhaoyx
 * @date 2021/7/15 15:15
 */
public class lambdaCode {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Integer[] nums = new Integer[]{1, 2, 3};
        list.add(11);
        list.add(12);
        list.add(13);
        map.put(21, 1);
        map.put(22, 1);
        map.put(23, 1);
        //map转为串行和并行流
        Stream<Integer> stream1 = map.keySet().stream();
        Stream<Integer> stream2 = map.keySet().parallelStream();

        //list转为流
        Stream<Integer> stream3 = list.stream();
        Stream<Integer> stream4 = list.parallelStream();

        //数组转为流
        Stream<Integer> stream5 = Arrays.stream(nums);

        list.forEach(System.out::println);

        //合并数据流
        Stream<Integer> concat = Stream.concat(list.stream(), map.keySet().stream());
//        concat.forEach(System.out::println);

        //迭代创建无限流
        Stream<Integer> stream_iterate = Stream.iterate(1, e -> e + 1).limit(10);
        stream_iterate.forEach(System.out::println);

        //生成无限流
        Stream<Double> stream_generator = Stream.generate(Math::random).limit(2);
        stream_generator.forEach(System.out::println);

        int i = 0;
        i = i + ++i;
        /* 操作数栈        0
         局部变量表i = 1
         操作数栈      1
         *
         *
         *
         * */
        System.out.println(i);
    }
}
