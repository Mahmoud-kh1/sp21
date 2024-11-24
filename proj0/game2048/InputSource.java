<<<<<<< HEAD
package game2048;

/** Describes a source of input commands.
 *  @author P. N. Hilfinger
 */
interface InputSource {

    /** Returns one command string. */
    String getKey();

    /** Returns a candidate Tile whose row and column is in the range
     *  0 .. SIZE-1.  */
    Tile getNewTile(int size);

}

=======
package game2048;

/** Describes a source of input commands.
 *  @author P. N. Hilfinger
 */
interface InputSource {

    /** Returns one command string. */
    String getKey();

    /** Returns a candidate Tile whose row and column is in the range
     *  0 .. SIZE-1.  */
    Tile getNewTile(int size);

}

>>>>>>> 160747451c147c59d8e3cbf70a7afee2b73bebdb
