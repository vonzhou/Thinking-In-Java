package mythinking.unsafe;

/**
 * Created by vonzhou on 16/4/9.
 */
class Guard {
    private int ACCESS_ALLOWED = 1;

    public boolean giveAccess() {
        return 42 == ACCESS_ALLOWED;
    }
}
