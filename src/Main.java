public class Main {
   public static void main(String[] args) {

    //task 1

       var dog = 8.0;
       System.out.println(dog);
       var cat = 3.6;
       System.out.println(cat);
       var paper = 763789;
               System.out.println(paper);

          //task 2

               dog = dog * 4;
               System.out.println("Всего " + dog + " собаки" );
               cat = cat * 4;
               System.out.println("Всего " + cat + " кота");
               paper = paper * 4;
               System.out.println("Всего " + paper + " метров бумаги");

          //task 3

               var dogTotal = dog - 3.5;
               System.out.println(dogTotal);
               var catTotal = cat - 1.6;
               System.out.println(catTotal);
               var paperTotal = paper - 7639;
               System.out.println(paperTotal);

          //task 4

               var friend = 19;
               System.out.println(friend);
                friend = friend + 2;
               System.out.println(friend);
               var quantityFriends = friend / 7;
               System.out.println(quantityFriends);

          //task 5

               var frog = 3.5;
               System.out.println(frog);
               frog = frog * 10;
               System.out.println(frog);
               var frogsTotal = frog / 3.5;
               System.out.println(frogsTotal);
               var frogsTotalLeft = frogsTotal + 4;
               System.out.println(frogsTotalLeft);

           //task 6

               var boxerFirstWeight = 78.2;
               var boxerSecondWeight = 82.7;
               System.out.println(boxerFirstWeight);
               System.out.println(boxerSecondWeight);
               var totalWeight = boxerFirstWeight + boxerSecondWeight;
               System.out.println("Общая масса боксеров " + totalWeight+ " кг");
               var differenceWeight = boxerSecondWeight - boxerFirstWeight;
               System.out.println("Разница в весе " + differenceWeight + " кг");

           //task 7

               var remainingWeight = boxerSecondWeight % boxerFirstWeight;
               System.out.println("Остаток деления между двумя весами " + remainingWeight + " кг");

           //task 8

               var hoursWork = 640;
               var workingHours = 8;
               System.out.println(hoursWork);
               System.out.println(workingHours);
               var totalPeople =  hoursWork / workingHours;
               System.out.println("Всего работников в компании - " + totalPeople + " человек");

               var totalPeoplesNow = totalPeople + 94;
               System.out.println(totalPeoplesNow);
               var hoursWorkNow = totalPeoplesNow * 8;
               System.out.println("Если в компании работает " + totalPeoplesNow + " человек,"
                       + " то всего " + hoursWorkNow + " часов работы может быть поделено между сотрудниками");




   }

}