package com.example.touristapp.data

import com.example.touristapp.R
import com.example.touristapp.model.City
import com.example.touristapp.model.Site
import java.util.*


object TempDataSourceObj {
    val wishlist: MutableList<Site> = mutableListOf()
    val cities: List<City> = listOf(
        City(
            R.drawable.austin,
            "Austin"
        ),

        City(
            R.drawable.beijing,
            "Beijing"
        ),
        City(
            R.drawable.paris,
            "Paris"
        ),
        City(
            R.drawable.honolulu,
            "Honolulu"
        ),
        City(
            R.drawable.lasvegas,
            "Las Vegas"
        ),
        City(
            R.drawable.london,
            "London"
        ),
        City(
            R.drawable.manhattan,
            "New York City"
        ),
        City(
            R.drawable.mumbai,
            "Mumbai"
        ),
        City(
            R.drawable.tokyo,
            "Tokyo"
        ),
        City(
            R.drawable.singapore,
            "Singapore"
        ),
        City(
            R.drawable.san_francisco,
            "San Francisco"
        ),
        City(
            R.drawable.seoul,
            "Seoul"
        ),
        City(
            R.drawable.agra,
            "Agra"
        )

    )

    val sites: List<Site> = listOf(
        Site(
            R.drawable.zilker_park,
            "Zilker Park",
            "Austin",
            "Park",
            30.263988,
            -97.769641,
            "Zilker Park is a 361-acre park nestled in the heart of downtown, " +
                    "right off Lady Bird Lake. The park was founded in 1917 and is home to picnic" +
                    " facilities, bike/canoe rentals, a disc golf course, a large playground for " +
                    "children, the Zilker Zephyr train and Barton Springs Pool, an urban oasis where" +
                    " swimmers plunge into 68-degree, spring-fed waters. The park is also the host " +
                    "to great events like the Austin City Limits Music Festival and the Austin Kite " +
                    "Festival."
        ),
        Site(
            R.drawable.texas_state_capitol,
            "Texas State Capitol",
            "Austin",
            "Historical Landmark",
            30.274665,
            -97.740350,
            "Sited on one of Austin's highest points, the Capitol anchors the northern periphery" +
                    " of the downtown commercial district and commands a sweeping view towards the " +
                    "Colorado River from its southern façade. The main campus of The University of " +
                    "Texas at Austin is situated four blocks to the north. Wonderful views of the " +
                    "Capitol's dome from many vantage points throughout the Austin area are protected" +
                    " from obscuration by state law. Completed in 1888 as the winning design from a" +
                    " national competition, the Capitol's style is Renaissance Revival, based on the" +
                    " architecture of 15th-century Italy and characterized by classical orders, round " +
                    "arches and symmetrical composition. The structural exterior is \"sunset red\" " +
                    "granite, quarried just 50 miles from the site. Additional structural support is " +
                    "provided by masonry walls and cast iron columns and beams."

        ),
        Site(
            R.drawable.congress_ave_bridge,
            "Congress Avenue Bridge",
            "Austin",
            "Historical Landmark",
            30.261738,
            -97.745163,
            "Large numbers of bats began roosting in the Congress Avenue Bridge in the early " +
                    "1980s, shortly after it was renovated. Few people understood how valuable the " +
                    "bats were, and many feared them. It took a lot of effort by Bat Conservation " +
                    "International and other bat-friendly folks to help turn the tide of public " +
                    "opinion. Today, Austin loves its bats, and this international tourist attraction" +
                    " brings 140,000 people and as much as \$10 million to Austin every year! Watch " +
                    "from the lawn of the Austin American-Statesman’s Bat Observation Area, which " +
                    "offers educational kiosks year-round and volunteer bat educators from Bat " +
                    "Conservation International on weekend evenings from May through September. " +
                    "You can also get nice views of the long columns of emerging bats from atop the" +
                    " bridge itself. Boat tours are available from Lone Star Riverboats and Capital " +
                    "Cruises."
        ),
        Site(
            R.drawable.ut_austin,
            "University of Texas at Austin",
            "Austin",
            "Historical Landmark",
            30.284918,
            -97.734057,
            "Nicknamed the “Forty Acres” after the size of the university’s original 1883 " +
                    "footprint, The University of Texas at Austin’s main campus is a 431-acre " +
                    "urban oasis in the heart of the capital city of Texas. Campus is home to landmarks" +
                    " like the Tower at the heart of campus or the Perry-Castañeda Library with over" +
                    " 70 miles of book stacks. Discover the creativity of the Blanton Museum of Art" +
                    " and the exterior installation from Ellsworth Kelly, \"Austin.\""
        ),
        Site(
            R.drawable.lbj_library,
            "Lyndon Baines Johnson Library",
            "Austin",
            "Museum",
            30.285823,
            -97.729261,
            "While the thought of visiting a presidential library may sound like a bore, this " +
                    "one is an exception. Dedicated to the 36th president of the United States, " +
                    "Lyndon B. Johnson's library houses all the expected artifacts – including " +
                    "presidential papers – as well as several quirkier exhibits that are just as " +
                    "interesting as the president himself. From presidential holiday cards to photographs " +
                    "chronicling the civil rights era and an LBJ robot, this museum uses all types " +
                    "of mediums to narrate the president's life and political career."
        ),
        Site(
            R.drawable.louvre,
            "The Louvre",
            "Paris",
            "Museum",
            48.860294,
            2.338629,
            "Louvre, in full Louvre Museum or French Musée du Louvre, official name Great " +
                    "Louvre or French Grand Louvre, national museum and art gallery of France, housed" +
                    " in part of a large palace in Paris that was built on the right-bank site of " +
                    "the 12th-century fortress of Philip Augustus. It is the world’s most-visited " +
                    "art museum, with a collection that spans work from ancient civilizations to the" +
                    " mid-19th century."
        ),
        Site(
            R.drawable.tal_mahal,
            "Taj Mahal",
            "Agra",
            "Historical Landmark",
            27.173891,
            78.042068,
            "The Taj Mahal looms fairytale-like from the banks of the Yamuna River. It's " +
                    "India’s most recognized monument and is also one of the Seven Wonders of the " +
                    "World. The monument dates back to 1632 and is actually a tomb that contains the" +
                    " body of Mumtaz Mahal—the wife of Mughal emperor Shah Jahan. He had it built as" +
                    " an ode to his love for her. It's made out of marble and took 22 years and 20 000 " +
                    "workers to complete. Words cannot do the Taj Mahal justice, its incredible " +
                    "detail simply has to be seen to be appreciated."

        ),
        Site(
            R.drawable.great_wall_china,
            "Great Wall of China",
            "Beijing",
            "Historical Landmark",
            40.431908,
            116.570374,
            "The Great Wall of China is an ancient series of walls and fortifications, " +
                    "totaling more than 13,000 miles in length, located in northern China. Perhaps " +
                    "the most recognizable symbol of China and its long and vivid history, the Great" +
                    " Wall was originally conceived by Emperor Qin Shi Huang in the third century " +
                    "B.C. as a means of preventing incursions from barbarian nomads. The best-known" +
                    " and best-preserved section of the Great Wall was built in the 14th through 17th " +
                    "centuries A.D., during the Ming dynasty. Though the Great Wall never effectively" +
                    " prevented invaders from entering China, it came to function as a powerful symbol " +
                    "of Chinese civilization’s enduring strength."
        ),
        Site(
            R.drawable.palace_museum,
            "Palace Museum",
            "Beijing",
            "Museum",
            39.915588,
            116.396980,
            "Established in 1925, the Palace Museum is located in the imperial palace of the " +
                    "consecutive Ming (1368-1644) and Qing (1644-1911) dynasties. The magnificent " +
                    "architectural complex, also known as the Forbidden City, and the vast holdings " +
                    "of paintings, calligraphy, ceramics, and antiquities of the imperial collections" +
                    " make it one of the most prestigious museums in China and the world. In 1961, " +
                    "the State Council designated the former imperial residence as one of China's " +
                    "foremost-protected cultural heritage sites, and in 1987 it was listed as a " +
                    "UNESCO World Heritage site."
        ),
        Site(
            R.drawable.polynesian_cultural_center,
            "Polynesian Cultural Center",
            "Honolulu",
            "Museum",
            21.638950,
            -157.919858,
            "The Polynesian Cultural Center, voted the #1 attraction in Hawaii by USA Today, " +
                    "is located along the famous North Shore of Oahu. Explore 42 acres of tropical " +
                    "splendor featuring 6 authentic villages representing the island cultures of " +
                    "Hawaii, Fiji, Aotearoa (New Zealand), Samoa, Tahiti, and Tonga. Mingle with " +
                    "Pacific islanders as they share the majesty of their culture through music, " +
                    "dance and traditional hands-on activities. Our most popular dining option is " +
                    "the award-winning Ali’i Luau. This royal feast blends a delicious array of " +
                    "island and mainland dishes with the excitement of authentic island entertainment" +
                    " from across Polynesia. Finish your adventure though the power of “Ha: Breath " +
                    "of Life,” an action-packed evening show. Ignited by fire, song and dance " +
                    "featuring over 100 Polynesian performers, this story of passion will make this" +
                    " day a truly unforgettable experience. The Polynesian Cultural Center: all of " +
                    "Polynesia in one exciting place."
        ),
        Site(
            R.drawable.paris_las_vegas,
            "Paris Las Vegas",
            "Las Vegas",
            "Resort",
            36.112310,
            -115.170397,
            "Get whisked away to Europe’s most romantic city at the Paris Las Vegas. Located" +
                    " at the center of the Strip, this one-of-a-kind resort and casino offers " +
                    "upscale accommodations with Parisian flair and an abundance of amenities. " +
                    "Soak up the sun by the Soleil Pool, inspired by a Parisian garden, or unwind " +
                    "with a massage at the blissful Voie Spa & Salon. Explore more than ten dining " +
                    "outlets, including multiple cuisines and celebrity-chef restaurants. When you’re" +
                    " not trying your luck in the casino or catching a riveting show, ride to the top" +
                    " of the Eiffel Tower and stroll by the Arc de Triomphe. Paris Las Vegas is also" +
                    " home to a dueling piano lounge, as well as a vibrant nightlife scene that" +
                    " includes a rooftop dance floor and a terrace overlooking the Strip."
        ),
        Site(
            R.drawable.museum_modern_art,
            "Museum of Modern Art",
            "New York City",
            "Museum",
            40.761509,
            -73.978271,
            "The Museum of Modern Art was described by its first director as \"a torpedo " +
                    "moving through time.\" Since opening in 1929, MoMA has secured its place as" +
                    " a pioneer collector and exhibitor of modern art-from 19th-century Post-Impressionism" +
                    " to contemporary installations. MoMA's collection includes painting, sculpture," +
                    " drawings, prints, photography, film, architecture and design. In addition to" +
                    " its many galleries, the museum has a sculpture garden designed by Philip Johnson" +
                    " and also sponsors numerous gallery talks, lectures and performances."
        ),
        Site(
            R.drawable.national_museum_anthropology,
            "National Museum of Anthropology",
            "Mexico City",
            "Museum",
            40.407669,
            -3.688975,
            "The National Museum of Anthropology stages the Philippine ethnographic and " +
                    "terrestrial and underwater archaeological collections narrating the story of " +
                    "the Philippines from the past, as presented through artifacts as evidences of " +
                    "its pre-history."
        ),
        Site(
            R.drawable.gateway_india,
            "Gateway of India",
            "Mumbai",
            "Historical Landmark",
            18.922064,
            72.834641,
            "The Gateway of India is an arch monument built during the 20th century in Bombay, " +
                    "India. The monument was erected to commemorate the landing of King George V and" +
                    " Queen Mary at Apollo Bunder on their visit to India in 1911. Built in " +
                    "Indo-Saracenic style, the foundation stone for the Gateway of India was laid on" +
                    " 31 March 1911. The structure is an arch made of basalt, 26 metres (85 feet) " +
                    "high. The final design of George Wittet was sanctioned in 1914 and the " +
                    "construction of the monument was completed in 1924. The Gateway was later used" +
                    " as a symbolic ceremonial entrance to India for Viceroys and the new Governors " +
                    "of Bombay. It served to allow entry and access to India."
        ),
        Site(
            R.drawable.empire_state_building,
            "Empire State Building",
            "Manhattan",
            "Historical Landmark",
            40.748817,
            -73.985428,
            "Empire State Building, steel-framed skyscraper rising 102 stories that was " +
                    "completed in New York City in 1931 and was the tallest building in the world " +
                    "until 1971. The Empire State Building is located in Midtown Manhattan, on Fifth" +
                    " Avenue at 34th Street. It remains one of the most distinctive and famous " +
                    "buildings in the United States and is one of the best examples of Modernist " +
                    "Art Deco design."
        ),
        Site(
            R.drawable.eiffel_tower,
            "Eiffel Tower",
            "Paris",
            "Historical Landmark",
            48.858093,
            2.294694,
            "Eiffel Tower, French Tour Eiffel, Parisian landmark that is also a technological" +
                    " masterpiece in building-construction history. When the French government was" +
                    " organizing the International Exposition of 1889 to celebrate the centenary of " +
                    "the French Revolution, a competition was held for designs for a suitable " +
                    "monument. More than 100 plans were submitted, and the Centennial Committee " +
                    "accepted that of the noted bridge engineer Gustave Eiffel. Eiffel’s concept " +
                    "of a 300-metre (984-foot) tower built almost entirely of open-lattice wrought " +
                    "iron aroused amazement, skepticism, and no little opposition on aesthetic grounds. " +
                    "When completed, the tower served as the entrance gateway to the exposition."
        ),
        Site(
            R.drawable.fisherman_wharf,
            "Fisherman's Wharf",
            "San Francisco",
            "Historical Landmark",
            37.809326,
            -122.409981,
            "Fisherman’s Wharf, on the northern waterfront, is one of the city's busiest " +
                    "tourist areas. Souvenir shops and stalls selling crab and clam chowder in " +
                    "sourdough bread bowls appear at every turn, as do postcard views of the bay, " +
                    "Golden Gate and Alcatraz. There’s also a colony of sea lions to see and historic " +
                    "ships to tour. At Ghirardelli Square, boutiques and eateries reside in the famed" +
                    " former chocolate factory."
        ),
        Site(
            R.drawable.golden_gate_bridge,
            "Golden Gate Bridge",
            "San Francisco",
            "Historical Landmark",
            37.769722,
            -122.476944,
            "Crossing the strait of the Golden Gate from San Francisco's Presidio to the Marin" +
                    " headlands is the world-renowned Golden Gate Bridge, easily identified by its" +
                    " International Orange color. Once called \"the bridge that couldn't be built,\" " +
                    "today the Golden Gate Bridge is one the seven wonders of the modern world. This" +
                    " magnificent span, perhaps San Francisco's most famous landmark, opened in 1937" +
                    " after a four-year struggle against relentless winds, fog, rock and treacherous " +
                    "tides."
        ),
        Site(
            R.drawable.legion_honor_museum,
            "Legion of Honor Museum",
            "San Francisco",
            "Museum",
            37.784466,
            -122.500842,
            "The 1.7 mile-long bridge is anchored by towers that reach 746 feet skyward and " +
                    "was once taller than any building in San Francisco! To support the suspended " +
                    "roadway, two cables—each more than 7,000 feet in length and containing 80,000 " +
                    "miles of wire—stretch over the top of the towers and are rooted in concrete " +
                    "anchorages on shore."
        ),
        Site(
            R.drawable.n_seoul_tower,
            "N Seoul Tower",
            "Seoul",
            "Historical Landmark",
            37.551170,
            126.988228,
            "Namsan Seoul Tower was the first multipurpose tower to be established in Korea, " +
                    "effectively incorporating a sightseeing observatory to a broadcasting tower. " +
                    "For the past 40 years, Namsan Seoul Tower has served as an iconic landmark of " +
                    "Korea and a representative tourist attraction. The tower's observatory offers " +
                    "an unobstructed view of the whole city, allowing it to become one of the " +
                    "all-time favorite attractions of Seoul citizens as well as domestic and " +
                    "international tourists. Another highlight of the tower is the Namsan Cable Car." +
                    " The cable car began its operation in 1962, transferring passengers from the " +
                    "foot of the mountain to the base of the tower. Shuttle buses to the Namsan " +
                    "Cable Car from downtown Seoul are also available for visitors' convenience."
        ),
        Site(
            R.drawable.sensoji_temple,
            "Sensoji Temple",
            "Tokyo",
            "Historical Landmark",
            35.714661,
            139.796783,
            "Sensoji is perhaps the most famous and photographed of Tokyo's temples. It is " +
                    "the oldest Buddhist temple in the capital, and the five-story pagoda, trails " +
                    "of incense and vast eaves will take you back to a Tokyo of time gone by. The " +
                    "shopping street leading to Sensoji Temple, known as Nakamise-dori, is lined " +
                    "with about 90 shops selling crafts, souvenirs and plenty of sweet and savory " +
                    "snacks. Throughout the year, you can come across seasonal events held on the " +
                    "temple grounds. Some of the most popular include the hozuki (Chinese lantern " +
                    "plant) market in July and the photogenic hagoita (decorative paddle) market in " +
                    "December."
        ),
        Site(
            R.drawable.bayeast_garden,
            "Bay East Garden",
            "Singapore",
            "Historical Landmark",
            1.282375,
            103.864273,
            "\"Gardens by the Bay is not just about the domes and the supertrees! It took us " +
                    "a while to realise that Gardens by the Bay was actually made up of not just one" +
                    " but three separate gardens – Bay South, Bay East and Bay Central Gardens. Bay " +
                    "South Garden is the main Garden that houses the glamorous Supertrees and the " +
                    "prominent glass-domed Conservatories called the Cloud Forest and Flower Dome." +
                    " The lesser known Bay East Garden – a mere sliver on the Gardens map – is the " +
                    "second largest of the three Gardens. Because it is not as well-known, Bay East" +
                    " Garden is usually less crowded and more peaceful compared to the more popular " +
                    "Bay South Garden. The track that runs along the spine of Bay East Garden offers" +
                    " spectacular views all the way. How could we not fall in love with this place?\n" +
                    "\""
        )
    )

    fun searchSites(searchTerm: String): List<Site> {
        val s = searchTerm.lowercase(Locale.ROOT)
        val match = sites.filter { it.name.lowercase(Locale.ROOT).contains(s) }
        return match
    }
}