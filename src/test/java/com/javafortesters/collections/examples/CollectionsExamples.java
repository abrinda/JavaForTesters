package com.javafortesters.collections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class CollectionsExamples {

    String[] someDays = {"Tuesday", "Thursday", "Wednesday", "Monday", "Saturday", "Sunday", "Friday"};
    List<String> days = Arrays.asList(someDays);

    String[] workingDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    List<String> workdays = Arrays.asList(workingDays);

    String[] weekendDays ={"Saturday", "Sunday"};
    List<String> weekend = Arrays.asList(weekendDays);

    @Test
    public void simpleArrayExample() {
        String[] number0123 = {"zero", "one", "two", "three"};

        for (String numberText : number0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", number0123[0]);
        assertEquals("two", number0123[2]);
    }

    @Test
    public void simpleCollectionExample() {
        String[] number0123Array = {"zero", "one", "two", "three"};
        List<String> number0123 = Arrays.asList(number0123Array);
        for (String numberText : number0123) {
            System.out.println(numberText);
        }
        assertEquals("zero", number0123.get(0));
        assertEquals("three", number0123.get(3));
    }

    @Test
    public void simpleDynamicCollectionExample() {
        List<String> number0123 = new ArrayList<String>();

        number0123.add("zero");
        number0123.add("one");
        number0123.add("two");
        number0123.add("three");

        for (String numberText : number0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", number0123.get(0));
        assertEquals("three", number0123.get(3));
    }

    @Test
    public void simpleForEachLoopExample() {
        int forcount = 0;
        for (String day : days) {
            if (day.equals("Monday")){
                break;
            }
            forcount++;

            assertEquals("Monday is at position 3", 3, forcount);
        }
    }

    @Test
    public void simpleForLoopExample(){
        int loopCount;
        for (loopCount=0; loopCount <= days.size();loopCount++) {
            if (days.get(loopCount).equals("Monday"));{
                break;
            }
        }
            assertEquals("Monday is at position 3", 3, loopCount);
    }

    @Test
    public void simpleWhileLoopExample(){
        int count=0;
        while (!days.get(count).equals("Monday")){
            count++;
        }

        assertEquals("Monday is at position 3", 3, count);
    }

    @Test
    public void simpleDoWhileExample(){
        int docount=-1;
        do{
            docount++;
        }while (!days.get(docount).equals("Monday"));

        assertEquals("Monday is at position 3", 3, docount);
    }

    @Test
    public void useAForLoopInsteadOfADoWhileLoop(){
        int forwhile=0;
        for (forwhile=0; days.get(forwhile).equals("Monday"); forwhile++)

        assertEquals("Monday is at position 3", 3, forwhile);
    }

    @Test
    public void addElementsToACollection(){
        Collection<String> workdays = new <String>ArrayList();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        assertEquals(5, workdays.size());
    }

    @Test
    public void addAllElementsToACollection(){
        Collection<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.addAll(workdays);

        assertEquals(workdays.size(), daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(workdays));
    }

    @Test
    public void removeSomeElementsFromACollection(){
        Collection<String> daysOfWeekend = new ArrayList<>();

        daysOfWeekend.add("Saturday");
        daysOfWeekend.add("Sunday");
        daysOfWeekend.add("Funday");

        daysOfWeekend.remove("Funday");

        assertEquals(2, daysOfWeekend.size());
    }

    @Test
    public void iterateOverACollection(){
        Collection<String> allDays = new ArrayList<>();
        allDays.addAll(workdays);

        allDays.add("Saturday");
        allDays.add("Sunday");

        for(String dayOfWeek : allDays){
            System.out.println(dayOfWeek);
        }
    }

    @Test
    public void emptyACollection(){
        Collection<String> allDays = new ArrayList<>();
        allDays.addAll(workdays);

        allDays.add("Saturday");
        allDays.add("Sunday");

        assertEquals(7, allDays.size());

        allDays.clear();

        assertEquals(0, allDays.size());
        assertTrue(allDays.isEmpty());

    }

    @Test
    public void retainAllCollection(){
        Collection<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.addAll(workdays);
        daysOfWeek.addAll(weekend);

        assertTrue(daysOfWeek.containsAll(workdays));
        assertTrue(daysOfWeek.containsAll(weekend));

        daysOfWeek.retainAll(weekend);

        assertEquals("only weekend days", 2, daysOfWeek.size());

        daysOfWeek.retainAll(workdays);

        assertEquals("only working days", 5, workdays.size());
        assertFalse(daysOfWeek.containsAll(workdays));
        assertFalse(daysOfWeek.containsAll(weekend));
    }

    @Test
    public void toArrayCollection(){
        Object[] daysOfWeekArray = workdays.toArray();
        assertEquals(5, daysOfWeekArray.length);

        assertEquals("Monday".length(),((String) daysOfWeekArray[0]).length());
    }

    @Test
    public void toArrayAnArrayCollection(){
        String[] anotherArray = new String[workdays.size()];
        workdays.toArray(anotherArray);

        assertEquals("Monday".length(), anotherArray[0].length());
    }

    @Test
    public void collectionOfUsersExcersise(){
        Collection<String> users = new ArrayList<>();

        assertTrue(users.isEmpty());
        assertTrue(users.size()==0);

        users.add("user1");
        users.add("user2");

        assertTrue(users.size()==2);
        assertFalse(users.isEmpty());

        Collection<String> secondUsers = new ArrayList<>();
        secondUsers.add("user3");
        secondUsers.add("user4");
        users.addAll(secondUsers);

        assertEquals(4, users.size());
        assertTrue(users.containsAll(secondUsers));

        users.removeAll(secondUsers);

        assertEquals(2, users.size());
        assertFalse(users.containsAll(secondUsers));

        users.clear();

        assertEquals(0, users.size());
    }

    @Test
    public void getAnElementAtIndex(){
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));

        days.remove(1);

        assertEquals(2, days.size());
        assertEquals("Wednesday", days.get(1));
    }

    @Test
    public void addElementAtASpecificIndex(){
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Wednesday");
        days.add("Saturday");

        days.add(1, "Tuesday");
        days.add(3, "Thursday");
        days.add(4, "Friday");
        days.add(6,"Sunday");

        assertEquals(7, days.size());
        assertEquals("Saturday", days.get(5));
        assertEquals("Friday", days.get(4));
    }

    @Test
    public void addListOfElementsAtASpecificIndex(){
        List<String> days = new ArrayList<>();
        List<String> missingDays = new ArrayList<>();

        days.add("Monday");
        days.add("Saturday");

        assertEquals("Saturday", days.get(1));

        missingDays.add("Tuesday");
        missingDays.add("Wednesday");
        missingDays.add("Thursday");
        missingDays.add("Friday");

        days.addAll(1, missingDays);

        assertEquals(6, days.size());
        assertEquals("Thursday", days.get(3) );
    }

    @Test
    public void findTheIndexOfAnElement_andSetIndex(){
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Wednesday");
        days.add("Saturday");

        assertEquals(1, days.indexOf("Wednesday"));

        days.set(2, "Tuesday");

        assertEquals(3, days.size());
        assertEquals("Monday", days.get(0));
        assertEquals("Wednesday", days.get(1));
    }

    @Test
    public void lastIndexOfAnElement(){
        List<String> names = new ArrayList<>();

        names.add("boss");
        names.add("boss");
        names.add("princess");
        names.add("princess");
        names.add("boss");
        names.add("boss");
        names.add("princess");
        names.add("princess");
        names.add("boss");
        names.add("boss");

        assertEquals(7, names.lastIndexOf("princess"));
    }

    @Test
    public void subListToCreateAPortionOfAList(){
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        List<String> bestDays = days.subList(3,5);

        assertEquals(2, bestDays.size());
        assertEquals("Friday", bestDays.get(1));//e index 1 pentru ca e subList(deci e o noua lista)
    }

    @Test//exercitiu
    public void createAndManipulateAListOfUsers(){
        List<String> users = new ArrayList<>();

        users.add("user1");
        users.add("user2");

        assertEquals(2, users.size());

        users.add("user3");

        assertEquals(3, users.size());

        users.set(0, "user4");

        assertEquals("user4", users.get(0));
        assertEquals("user2", users.get(1));
        assertEquals("user3", users.get(2));

        users.remove(0);
        System.out.println(users);

        assertEquals(2, users.size());
        assertEquals("user2", users.get(0));
        assertEquals("user3", users.get(1));
    }

    @Test
    public void setDoesNotAllowDuplicateElements(){
        Set workdays = new HashSet();

        workdays.add("monday");
        workdays.add("tuesday");
        workdays.add("monday");

        assertEquals(2, workdays.size());
    }

    @Test//exercitiu
    public void manipulateASetOfUsers(){
        Set users = new HashSet();

        users.add("boss");
        assertEquals(1, users.size());

        users.add("boss");
        assertEquals(1, users.size());
    }

    @Test
    public void putGetKeyAndValueInMap(){
        Map<String, String> map = new HashMap<>();

        map.put("ce", "vrei");
        map.put("care", "este");
        map.put("cine", "esti");

        assertEquals(3, map.size());

        map.put("ce", "doresti");

        assertEquals("doresti", map.get("ce"));
        assertEquals("este", map.get("care"));
        assertEquals("esti", map.get("cine"));
    }

    @Test
    public void removeAndEmptyKeyAndValueInMap(){
        Map<String, String> fraze = new HashMap<>();

        fraze.put("salut", "ba");
        fraze.put("cf","boss");

        assertEquals(2, fraze.size());

        fraze.remove("salut");

        assertEquals(1, fraze.size());

        fraze.clear();

        assertEquals(0, fraze.size());
        assertTrue(fraze.isEmpty());
    }

    @Test
    public void checkKeysAndValues_WithContainsKeyAndContainsValue(){
        Map<String, String> salut = new HashMap<>();

        salut.put("salut", "ro");
        salut.put("ola", "es");
        salut.put("hello", "en");

        assertTrue(salut.containsKey("salut"));
        assertFalse(salut.containsKey("buenos dia"));

        assertTrue(salut.containsValue("es"));
        assertFalse(salut.containsValue("ger"));
    }

    @Test
    public void putAllAMapInTheMap(){
        Map<String, String> saluturiRomania = new HashMap<>();
        Map<String, String> saluturiStraine = new HashMap<>();

        saluturiRomania.put("buna","Timisoara");
        saluturiRomania.put("hei", "Bucuresti");

        assertEquals(2, saluturiRomania.size());

        saluturiStraine.put("hei", "Bucuresti");
        saluturiStraine.put("hello", "UK");

        assertEquals(2, saluturiStraine.size());

        saluturiRomania.putAll(saluturiStraine);

        assertEquals(3, saluturiRomania.size());
    }
}