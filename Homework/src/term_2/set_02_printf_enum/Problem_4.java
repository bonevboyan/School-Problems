package term_2.set_02_printf_enum;

public class Problem_4 {
    public static void main(String[] args) {
        for(Currency m : Currency.values()) {
            System.out.printf("%d) %s - %d of this currency = 1 USD\n", m.ordinal(), m, m.price);

            switch (m){
                case GuineanFranc -> System.out.println("The Guinean franc (French: franc guinéen, ISO 4217 code: GNF) is the currency of Guinea.");

                case SierraLeoneanLeone -> System.out.println("The leone is the currency of Sierra Leone. It is subdivided into 100 cents, but denominations in cents are no longer in use due to the low value of the currency.");

                case UzbekistaniSom -> System.out.println("The soʻm (Uzbek: soʻm in Latin script, сўм in Cyrillic script) is the currency of Uzbekistan in Central Asia.");

                case IndonesianRupiah -> System.out.println("The rupiah (Rp) is the official currency of Indonesia. Issued and controlled by Bank Indonesia, its ISO 4217 currency code is IDR.");

                case VietnameseDong -> System.out.println("The đồng (Chữ Hán: 銅) (/dɒŋ/; Vietnamese: [ˀɗɜwŋ͡m˨˩]; sign: ₫ or informally đ; code: VND) has been the currency of Vietnam since 3 May 1978.");

                case UgandanShilling -> System.out.println("The shilling (sign: USh; code: UGX) is the currency of Uganda. Officially divided into cents until 2013, the shilling now has no subdivision.");
            }
        }
    }
}
