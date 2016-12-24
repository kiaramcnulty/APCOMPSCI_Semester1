public class Algo200
{
    public static void main(String[]args)
    {
        String letters = "caanqaaeamdwaagarapabseaawaabawaoaalaaaaaxxaapsxeaagragaaadawaoaanaawpqatdaaatakwsaaaayaaaaealabjxaaaeaaauamjawnsaataaaoaaqaxaaaaaeaajrahaaaaaadjaaqtewhspaaaaannaoaaaaaboaaaaaaaaaataqadihaaaaqawwaaazoaxaoapabuzwaaaaaaaahlaauakaaiyjavwcaasxaaturabanuataoikpkaoalaaaaaaafgaalwuxzaazaaltazjdaaasalraabaqjmaaadaaaaaaaaiauaqbajaaactaarwrcavmaaxxaqrxaaaaaaaeaaaqaajafaaadaciaaaakadraacafaahlaiaaaakefahalaaparxaaagaacnoraaytaloasaadaaaafataaoqarcazjmqeafajgaaaaaaavvaaaaaiaaaaiaaczrbalomaakgilacaayaayaxwaotaarlaxpaaraapaaaswhxxaajeagfaaaaeaaalaaaaeeaatoamayaaauaadaueccvaauvaakowasxaaatgnwaawtrxtudppfaaqfypaaaaanraiaaaynagqqaabdaayaaazaesasaaaaaaoaaaaacvawcasaiaaaavxafaqeaaadaciaaanujgxamxiaadazanaamaygabwrfazalaaawkpaalsaafiiataatavvaqaqzdatyaaaaanpsaaaajvaydxacyadaolabhocaaawaniniuaaakaaiaaanxaaxaccfaarlaakaabenevaaacaydaaxaaxepasmaasadabanaaafaalaladaagafaaaaaahagnixwemathayfagaxapkaaaafaasaacawaaaaackawamaaaawaatnaaoaaatbaniafawaalkaaumqzaoaauaamazaztamvdaxdaraeasaaaaachoavaaaqaajwaaaaaacarlaxaaapaaaaamfaaoeaoaaamapkacamraalbnavaaaxiaqazaamcmanagaicraawaaascbmraaavabaawaagqataazuaaaaakawxwazparaaaaaaaaasaiedhfaaaetaaaapaaapiaaaawembhmafalgayaaodamqazqwaasdeaappaacaarahnalaeaaaaanasasbzaaaaoaraeaazhaaevoiaazpypuggeayaapanzakaaaavzaacaaraaaaaaaxsvyacoxvttzgtbcuazxkuaaaiflbjzaaojaboxmaadkaaakzsbxaaaajanaatgaaaazarfaawujasaanxazowlfaayahaaaaaabdoayufltoaiabayaaafawiazaqaasaafchifgpjuvauaaayaaatvaxaaeaaharrazavlayaaaaaaagxcfaemvyaaaaaaulxajahazgapaasagswmahaapbaaafnaaywpagqiauaaaavbmgifaweatvaayhaadajaaaaragaminaafixwuaaexaajawzaazlaxastaatmdaaaaairfnraaaaaaaxaafgaattgakkaacioaabatahfqabmvzfzafifsbbnaaouaahalaahuaawaagataamarjgaaaamianabhaaaaaaiahtpxvaaaaaaahaahtgaaaazvafaaaavzkamalawaaqeaaaavgjkanenairaalazaaaayafsazaacodeawvamtdyaaaynaaxaazvssadaqdvstaaolcsecwszzaajahawajooaahgumavaabriwaazgrtaauaxpaaawbhaberaqltaaaaqaaaaxayldaaxgakmwmaaxxayualfaaijsaaaazxpaaaewcngnaaaypvmayaiaamaasaaakattsadqclclafadaaaadsnwdnaaqasataabasaataaaapajqatuakaygaaoamatgaacaaaaaljwzaaaqajafanaaxaagxqaaibgaslawuadeaaxbaweaxxaaaaesnaacatahaitatqsabkaaaaatlajpavaaadlnvzaeaascaaaahqmatanapciszqefcalacjraamhaaaaoanaganaaaaacaqcnaayaawaagazaayyaayjagasarbuafzpmpqeaohaaaglidaanrheaaaabnnaairalrbjuzaakaabgaeaadaaetaauaaaaazaadzxaaaagavazehulaauazvcaajcaaaaqgexaaaaajcirxauaahaoaaahohaanaayoaalukbaauaaaaioaaakcobkoaqdvalasraaawuaakaaaaaadamsaaaaaqakaanaxaaaiwaodazaanaaaravbqimznaataaesaavyqjakgabaeaiasamapaaaalwzaikpbclaaaacalakusaapaaaaqnaanaaahoaaaecaarwwaaaabxaaaaaepalaaaaaaaxaxgamawmalaaaaanqeaaaaxaomajaaaiavaaqxwaazaaaaaaaaapqpaaaaaastgdydwxaalahaiziaamauayaqaxyryaizkaefuaaaaaaaeaaanaaiaaaaayaaaaaaiywaaahaaaaajtawmanmadayaaawaaaaxagaaicaiagaaanaaakaodapaaaaabaaaaaadauevaaywbaaaaaaaaaaygaaawaazimwasraazoagvzpaabrnmlhqghhoaaanbaaanaaaaaqxauaaataaaabaahaaaafzaawaapaaaaaarazalqhobgzacazasauaaaaaujafowabywlaagaaadaaatamaaagnpmaeaaaaahmmxapanaraagsxoutbaaaauaqamlazaaaaaaaazaalnsacxltaavaaxpldaqqhapasmalaasutapuasaaatuloaaadaizmaaaaaqqyalyopwakaayhvyaaaczjeauavauxypyenmaaqiaaqiaahuaaakaauja";

        int counter = 0;

        for (int i = 0; i < letters.length() - 1; i++)
        {
            String letter = String.valueOf(letters.charAt(i));
            if (letter.equals("a"))
            {
                String letterBefore = String.valueOf(letters.charAt(i-1));
                if (!(letterBefore.equals("a")))
                {
                    String letterAfter = String.valueOf(letters.charAt(i+1));
                    if (letterAfter.equals("a"))
                    {
                        counter+=1;
                    }
                }
            }
        }
        
        System.out.println(counter);
    }
}
