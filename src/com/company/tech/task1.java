package com.company.tech;
import java.awt.font.FontRenderContext;
import java.util.Collections;

    /*
    1 заполнить массив 1-5 случайными числами, и вывести максимум среднее арифметическое и минимум рандом
    2 дан массив цел числе необходимо удалить все входящие этого числа их массива
    3 реализовать иерархию классов из простых фигур (квадрат ромб и круг)
    4 реализовать иерархию классов животных абстрактные
    5 иерархию из 4 классов сделаем классы интерфейсные
     */

        public class task1 {
            public static void main(String[] args) {
                int[] array;
                array = new int[5];
                for (int i = 0; i < array.length; i++) {
                    array[i] = ((int) (Math.random() * 100));
                    System.out.println(array[i]);
                }
                int maxValue = array[0];
                int minValue = array[0];
                double res=0;
                for(int i=1;i < array.length;i++){
                    if(array[i] > maxValue){
                        maxValue = array[i];
                    }

                }
                for(int i=1;i < array.length;i++){
                    if(array[i] < minValue){
                        minValue = array[i];
                    }

                }
                for (double m :array){
                    res += m;
                }
                System.out.println("Маx:");
                System.out.println(maxValue);
                System.out.println("Мin:");
                System.out.println(minValue);
                System.out.println("ср:");
                System.out.println(res/array.length);
            }
        }


