<<<<<<< HEAD
package gitlet;

/** General exception indicating a Gitlet error.  For fatal errors, the
 *  result of .getMessage() is the error message to be printed.
 *  @author P. N. Hilfinger
 */
class GitletException extends RuntimeException {


    /** A GitletException with no message. */
    GitletException() {
        super();
    }

    /** A GitletException MSG as its message. */
    GitletException(String msg) {
        super(msg);
    }

}
=======
package gitlet;

/** General exception indicating a Gitlet error.  For fatal errors, the
 *  result of .getMessage() is the error message to be printed.
 *  @author P. N. Hilfinger
 */
class GitletException extends RuntimeException {


    /** A GitletException with no message. */
    GitletException() {
        super();
    }

    /** A GitletException MSG as its message. */
    GitletException(String msg) {
        super(msg);
    }

}
>>>>>>> 160747451c147c59d8e3cbf70a7afee2b73bebdb
