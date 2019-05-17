import inet.ipaddr.IPAddress;
import inet.ipaddr.IPAddressString;
import org.apache.commons.net.util.SubnetUtils;

import com.google.common.net.InetAddresses;

import java.net.InetAddress;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
         //Main.scanTokenisedElements();
        Main.checkCIDRRange();
    }

    private static void scanTokenisedElements () {

        String input = "=.eu,.ch,.li,.ac.nz,.co.nz,.geek.nz,.gen.nz,.maori.nz,.net.nz,.org.nz,.school.nz,.co.za,.xxx,.us,.co,.fm,.cn,.com.cn,.net.cn,.org.cn,.cm,.com.cm,.co.cm,.net.cm,.it,.nl,.mu,.fr,.re,.je,.co.je,.gg,.co.gg,.wf,.pm,.yt,.tf,.asia,.in,.co.in,.net.in,.firm.in,.gen.in,.ind.in,.org.in,.com.mx,.mx,.mobi,.fm,.so,.sx,.kiwi.nz,.co.no,.co.nl,.pro,.as,.ec,.com.ec,.info.ec,.net.ec,.xn--55qx5d,.africa,.academy,.army,.bargains,.bid,.bike,.bio,.black,.blackfriday,.blue,.cab,.capital,.cash,.catering,.center,.cheap,.codes,.coffee,.community,.condos,.degree,.desi,.digital,.domains,.education,.email,.equipment,.estate,.exchange,.exposed,.fail,.farm,.foundation,.fund,.futbol,.gallery,.gives,.glass,.global,.graphics,.gripe,.guru,.haus,.hiphop,.hiv,.how,.ink,.institute,.jetzt,.kim,.lease,.lighting,.limo,.link,.ltda,.maison,.management,.meet,.menu,.moe,.network,.ninja,.onl,.ooo,.partners,.pics,.pink,.press,.productions,.qpon,.recipes,.rehab,.reise,.reisen,.rentals,.report,.republican,.rest,.reviews,.rich,.rocks,.rodeo,.ruhr,.schule,.services,.shiksha,.singles,.software,.solar,.solutions,.soy,.space,.supplies,.supply,.support,.surgery,.systems,.tax,.tienda,.tips,.today,.tools,.top,.town,.toys,.trade,.training,.vacations,.ventures,.vet,.viajes,.villas,.vision,.vodka,.voting,.voto,.wang,.watch,.webcam,.wiki,.xyz,.zone,.archi,.bzh,.eus,.gal,.immo,.scot,.ski,.tirol,.versicherung,.wien,.bar,.bayern,.berlin,.brussels,.capetown,.cologne,.cymru,.durban,.gent,.hamburg,.joburg,.koeln,.london,.melbourne,.moscow,.nagoya,.nrw,.nyc,.okinawa,.paris,.quebec,.ryukyu,.saarland,.sydney,.taipei,.tokyo,.vegas,.vlaanderen,.wales,.yokohama,.industries,.accountants,.actor,.agency,.associates,.attorney,.auction,.audio,.band,.beer,.best,.boutique,.build,.builders,.business,.buzz,.camera,.camp,.cards,.care,.career,.careers,.casa,.ceo,.christmas,.church,.city,.claims,.cleaning,.click,.clinic,.clothing,.club,.coach,.company,.computer,.construction,.consulting,.contractors,.cooking,.cool,.country,.credit,.creditcard,.cricket,.cruises,.dance,.dating,.deals,.delivery,.democrat,.dental,.dentist,.diamonds,.diet,.direct,.directory,.discount,.energy,.engineer,.engineering,.enterprises,.events,.expert,.finance,.financial,.fish,.fishing,.fitness,.flights,.florist,.forsale,.furniture,.gift,.gifts,.gratis,.green,.guide,.guitars,.healthcare,.help,.holdings,.holiday,.horse,.host,.hosting,.house,.immobilien,.insure,.international,.investments,.juegos,.kaufen,.kitchen,.kiwi,.land,.lawyer,.legal,.life,.limited,.loans,.luxury,.market,.marketing,.media,.memorial,.moda,.money,.mortgage,.organic,.parts,.party,.photo,.photography,.photos,.physio,.pictures,.pizza,.place,.plumbing,.properties,.property,.pub,.red,.repair,.restaurant,.sarl,.science,.sexy,.shoes,.social,.surf,.tattoo,.technology,.university,.uno,.vote,.voyage,.website,.work,.works,.world,.wtf,.yoga,.xn--io0a7i,.xn--ngbc5azd,.xn--3ds443g,.xn--fiq228c5hs,.xn--4gbrim,.xn--6frz82g,.xn--80adxhks,.xn--80asehdb,.xn--80aswg,.xn--c1avg,.xn--i1b6b1a6a2e,.xn--mgbab2bd,.xn--nqv7f,.xn--q9jyb4c,.bingo,.casino,.chat,.design,.fashion,.fit,.flowers,.football,.garden,.lat,.lgbt,.one,.osaka,.poker,.rip,.school,.style,.tennis,.tires,.wedding,.xn--55qx5d,.xn--6qq986b3xl,.nz,.ngo,.ong,.org.za,.net.za,.web.za,.video,.cloud,.courses,.study,.apartments,.porn,.sucks,.adult,.cafe,.express,.gold,.golf,.news,.plus,.review,.run,.racing,.lol,.movie,.show,.tours,.art,.college,.fans,.love,.online,.protection,.rent,.security,.site,.store,.tech,.theatre,.tickets,.feedback,.reit,.team,.jewelry,.law,.abogado,.amsterdam,.download,.dog,.la,.games,.win,.live,.miami,.earth,.sex,.irish,.lat,.xn--80adxhks,.studio,.soccer,.fyi,.wine,.family,.tube,.fun,.moi,.xn--rovu88b,.xn--gckr3f0f,.xn--1ck2e1b,.xn--cck2b3b,.xn--bck1b9a5dre4c,.xn--jvr189m,.xn--fct429k,.bet,.accountant,.swiss,.mom,.faith,.pet,.africa,.basketball,.health,.creditunion,.sale,.blog,.coupons,.film,.gmbh,.hockey,.loan,.ltd,.luxury,.markets,.mba,.memorial,.men,.nagoya,.osaka,.realty,.stream,.vin,.ac,.sh,.io,.boston,.aero,.tel,.taxi,.biz,.boston,.date,.vip,.xn--fiqs8s,.info,.storage,.com.pr,.biz.pr,.net.pr,.org.pr,.pr";

        Arrays.stream (input.split(","))
                .map( s ->  "'" + s + "'," ).
                forEach( s -> System.out.print(s) );

    }

    public static void checkCIDRRange()  {
        String ipRange = "192.168.100.0/22";
        SubnetUtils subnetUtils = new SubnetUtils(ipRange);
        System.out.println (subnetUtils.getInfo().getLowAddress());
        System.out.println (subnetUtils.getInfo().getHighAddress());

        String ipRangeV6 = "435:23f::45:23/101";
        //SubnetUtils subnetUtilsV6 = new SubnetUtils(ipRangeV6);
        // System.out.println (subnetUtilsV6.getInfo().getLowAddress());//
        // System.out.println (subnetUtilsV6.getInfo().getHighAddress());

        System.out.println( " IPAddress ");
        IPAddressString addrString = new IPAddressString(ipRangeV6);
        IPAddress subnet  = addrString.getAddress();
       // subnet.getLower().g
        //IPAddress highest = subnet.getHighest();
        System.out.println  (subnet.getLower());
        System.out.println  (subnet.getUpper());
        IPAddress hostAddress = addrString.getHostAddress();

        //IPAddress prefixBlock = address.toPrefixBlock();
        //Integer prefixLength = address.getNetworkPrefixLength();

        //System.out.println(address);
        //System.out.println(hostAddress);
        //System.out.println(prefixBlock);
        //System.out.println(prefixLength);

        // https://seancfoley.github.io/IPAddress/
        // https://github.com/seancfoley/IPAddress
        //System.out.println  (addrString.getAddress().get());



    }

}
