import java.util.*;
/**
 * The class GrandNationalHorse is used to hold data about
 * a collection of Grand National horses
 * where the keys are Integers representing a year of the race, 
 * and the values are Sets of Strings where each string in a Set 
 * represents a name of the horse. Names of the horse are unique 
 * but the same horse take part in races in different years.
 * 
 * @author Irmina Janvier 
 * @version 24 April 2017
 */
public class GrandNationalHorse
{
   // instance variables 
   private SortedMap<Integer, Set<String>> horsesMap;
   Set<String> horses = new HashSet<>();
   
   /**
    * Constructor for objects of class GrandNationalHorse
    */
   public GrandNationalHorse()
   {
      super();
      this.horsesMap = new TreeMap<>();
   }

   /**
    * Populates a map horsesMap, stores and retrieves data about 
    * Grand National races' years and horses.
    */
   public void horsesDemo()
   {
      horses.add("One For Arthur");
      horses.add("Cause Of Causes");
      horses.add("Saint Are");
      horses.add("Blacklion");
      horsesMap.put(2017, horses);
      
      horses = new HashSet<>();
      horses.add("Rule The World");
      horses.add("Gilgamboa");
      horses.add("Shutthefrontdoor");
      horses.add("Wonderful Charm");
      horsesMap.put(2016, horses);
      
      horses = new HashSet<>();
      horses.add("Many Clouds");
      horses.add("Monbeg Dude");
      horses.add("Shutthefrontdoor");
      horses.add("Cause Of Causes");
      horsesMap.put(2015, horses);
   }
      
   /**
    * Prints out the horsesMap contents. 
    * Returns no value. 
    */
   public void printMap()
   {   
      for(Integer eachYear : horsesMap.keySet())
      {
        horses = horsesMap.get(eachYear);
        System.out.println("Grand National horses in " + eachYear + " included: ");
        for(String eachHorse : horses)
        {
           System.out.println(" - " + eachHorse);
        }
      }
   }
   
   /**
    * Creates a set referenced by the variable horses. 
    * Takes as its argument a integer representing a year 
    * when the Grand National took place.
    * Prints names of horses of the Grand National race 
    * that happened that year. Otherwise, prints a message that 
    * there is no data for that year.
    * 
    * @param aYear year of the Grand National race. If aYear is null 
    * then a message is printed that the key is not present.
    */
   public void printMapValue(int aYear)
   {
      horses = horsesMap.get(aYear);
      if((horsesMap.get(aYear))== null)
      {
         System.out.println("There is no data about the Grand National horses in " + aYear);
      }
      else
      {
         System.out.println("In " + aYear + " the following horses run in Grand National: ");
         for(String eachHorse : horses)
         {
             System.out.println(" - " + eachHorse);
         } 
      }
   }
   
   /**
    * Takes two arguments - Integer raceYear representing a key 
    * and Set<String> theHorses representing a value. 
    * Adds the key and value to the map.  
    * Returns no value.
    * 
    * @param raceYear a year of the Grand National race. If it already exists in the map, 
    * the horses of the names are overwritten.
    * @param theHorse a set of names of horses that run in the Grand National
    * in a given year
    */
   public void addMapEntry(Integer raceYear, Set<String> theHorses) 
   {
      Set<String> horsesAdded = new HashSet<>();
      
      for(String eachHorse : theHorses)
      {
         horsesAdded.add(eachHorse);
      }
      this.horsesMap.put(raceYear, horsesAdded);
   }
   
   /**
    * Takes a single argument Integer raceYear representing a key 
    * in the map. If the year given as the argument exists in the map, 
    * deletes the year and the horses names for that year 
    * of the race from the map, and returns true. Otherwise returns false.
    * 
    * @param raceYear a year of the Grand National race. 
    * @return true or false to indicate the success of deleting 
    * the year of the race and horses names for that year.
    */
   public boolean deleteEntry(Integer raceYear)
   {
      boolean removed = false;
      Set<String> horsesNames = this.horsesMap.get(raceYear);
      if((horsesMap.remove(raceYear)) == null)
      {
         return removed;
      }
      else
      {
         removed = true;
         return removed;
      }
   }
   
   /**
    * Returns a collection of all years of the races representing
    * keys in which a horse with a horseName given as the argument run 
    * at the Grand National.
    * 
    * @param horseName a horse name to be checked against the names of horses
    * that run in the Grand National
    * @return years of the races when the horse given as an argument run in
    * the Grand National.
    */
   public Set<Integer> selectKeys(String horseName)   
   {
      Set<Integer> horseRacesYears = new HashSet<>();
      Set<Integer> raceYears = this.horsesMap.keySet();

      for(Integer eachYear : raceYears)
      {
         Set<String> horses = this.horsesMap.get(eachYear);
         if(horses.contains(horseName))
         {
            horseRacesYears.add(eachYear);
         }
      }
      return(horseRacesYears);
   }
   
   /**
    * Adds a new horse's name, representing map's value, to the collection 
    * of names for a particular raceYear, representing a key in the map. 
    * Assumes that the raceYear is already in the map. 
    * Returns no value.
    * 
    * @param raceYear a year of the Grand National race. 
    * @param aName a horse name of the horse that run at Grand National 
    * in the given year.
    */
   public void addValue(Integer raceYear, String aName)
   {
      Set<String> horsesNames = this.horsesMap.get(raceYear);
      horsesNames.add(aName);
      this.horsesMap.put(raceYear, horsesNames);
   }
   
   /**
       * Deletes a name of a horse representing a variable aName from the collection of  
       * names for a particular year of the race representing a key. 
       * Assumes that the year exists in the map and the corresponding collection 
       * contains the horse's name. Returns no value.
       * 
       * @param raceYear a year of the Grand National race. 
       * @param aName a horse name of the horse that run at Grand National 
       * in the given year that will be deleted.
       */
   public void deleteValue(Integer raceYear, String aName)  
   {
      Set<String> horsesNames = this.horsesMap.get(raceYear);
      horsesNames.remove(aName);
   }
}

