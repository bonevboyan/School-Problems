package term_2.set_02_printf_enum;

public enum Currency {
    GuineanFranc(9198),
    SierraLeoneanLeone(8446),
    UzbekistaniSom(8336 ),
    IndonesianRupiah(14237),
    VietnameseDong(23194),
    UgandanShilling(3714);

    int price;
    Currency(int p) {
        price = p;
    }
    int showPrice() {
        return price;
    }
}
