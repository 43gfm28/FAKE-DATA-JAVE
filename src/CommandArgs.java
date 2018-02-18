/**
 * Created by ehtra on 08.10.2017.
 */
class CommandArgs {
    private int count;
    private String locale;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public CommandArgs(String[] args){
        count = Integer.parseInt(args[1]);
        locale = args[0];
    }
}
