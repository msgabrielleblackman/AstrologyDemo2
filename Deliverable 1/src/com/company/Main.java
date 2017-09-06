package com.company;

public class isArmstrong {

    public boolean isArmstrong(int i){
        if (i >= 100) if (i <= 999) if (sumCubeDigits(i) == i) return true;
        return false;
    }
    system.out.println()
    private int sumCubeDigits(int digits) {
        if (digits == 0)
        return 0;
        else
            return cube(digits % 10)+ sumCubeDigits(digits/10)
    }
        private int cube(int i) {
        return i * i *i;
        }
);
    }
}
