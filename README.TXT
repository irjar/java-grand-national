Scenario: A Jockey Club keeps a record of names of horses that run in the 
Grand National for each year since it was established. 
The record is kept using a map, where the keys are Integers, 
each representing a year of the race, and the values are 
Sets of Strings where each string in a Set represents a name of the horse. 

The class GrandNationalHorse is used to hold data about
a collection of Grand National horses
where the keys are Integers representing a year of the race, 
and the values are Sets of Strings where each string in a Set 
represents a name of the horse. Names of the horse are unique 
but the same horse take part in races in different years.




GrandNationalHorse horsesTest = new GrandNationalHorse();         //creates an instance of NationalHorse

horsesTest.horsesDemo();                                          // tests if the horsesDemo method creates 
                                                                  // a map of keys as years when
                                                                  // a race took place, and an unsorted set of map
                                                                  // with horses names as values.

horsesTest.printMap();                                            // prints the horsesmap 

horsesTest.printMapValue(2017);                                   // prints the names of horses for Grand National in 2017

horsesTest.printMapValue(2018);                                   // prints a statement that the data is not found 
                                                                  // for a year that is not in the Map

Set<String>horsesNames = new HashSet<>();                         // creates a set horsesNames
horsesNames.add("One for Arthur");                                // adds a horse's name to the set horsesNames
horsesNames.add("Pleasant Company");                              // adds a horse's name
horsesTest.addMapEntry(2017, horsesNames);                        // replaces the horses names for 2017 with the ones
                                                                  // in the set horsesNames 
horsesTest.addMapEntry(2018, horsesNames);                        // adds a year 2018 and horses names for that year to a map

horsesTest.deleteEntry(2017);                                     // removes the race year 2017 from the map together 
                                                                  // with names of horses which run that year and returns true
horsesTest.deleteEntry(2019);                                     // returns false for the race year 2018 which does not exist in the map

horsesTest.selectKeys("Shutthefrontdoor");                        // Returns all race years when a horse with a name Shutthefrontdoor
                                                                  // run in the race
                                              
horsesTest.addValue(2016, "Vicente");                             // adds a horse's name "Vicente" representing a map's value, 
                                                                  // to a collection of names of horses in 2017
                                         
horsesTest.deleteValue(2016, "Vicente");                          // adds a horse's name "Vicente" representing a map's value, 
                                                                  // to a collection of names of horses in 2017
                                                                               
                                              
