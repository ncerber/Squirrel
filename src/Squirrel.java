public class Squirrel {
    private int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index) {
        return nuts[index];
    }

    public int maxNuts() {
        int startIndex = 0;
        int nutsTotal = 0;

        if (nuts[0] < 0 && nuts.length > 1 && nuts[1] > nuts[0]) startIndex = 1;

        for (int i = startIndex; i < nuts.length; i++) {
            if (nutsTotal < 0) nutsTotal = 0;
            if (nuts[i] >= 0) {
                nutsTotal += nuts[i];
                continue;
            }

            if (i == nuts.length - 1) continue;

            if (nuts[i + 1] >= nuts[i]) {
                nutsTotal += nuts[i + 1];
                i++;
            } else {
                nutsTotal += nuts[i];
            }

        }
        return nutsTotal;
    }
}
