public static int[] create_dancing_numbers(int x) {
    ArrayList<Integer> dancingNumbersList = new ArrayList<>();

    for (int i = 0; i <= x; i++) {
        if (i < 10) {
            dancingNumbersList.add(i);
            continue;
        }
        int check = 1;
        int temp = i;
        int digit = temp % 10;
        temp /= 10;
        while (temp != 0) {
            if (Math.abs(digit - temp % 10) != 1) {
                check = 0;
                break;
            }
            digit = temp % 10;
            temp /= 10;
        }
        if (check != 0) {
            dancingNumbersList.add(i);
        }
    }

    // Convert ArrayList to an integer array
    int[] dancingNumbersArray = new int[dancingNumbersList.size()];
    for (int i = 0; i < dancingNumbersList.size(); i++) {
        dancingNumbersArray[i] = dancingNumbersList.get(i);
    }

    return dancingNumbersArray;
}
