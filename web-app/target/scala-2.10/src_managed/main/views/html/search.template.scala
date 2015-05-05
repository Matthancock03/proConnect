
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[UserModel],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[UserModel]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("ProConnect")/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""
 """),_display_(Seq[Any](/*7.3*/navbar/*7.9*/.render)),format.raw/*7.16*/("""


<div class="container">
	<div class="row clearfix">
		<div class="col-xs-5 column">
			<img alt="140x140" src="http://www.clker.com/cliparts/z/1/T/u/9/2/search-icon-md.png"  width="42" height="42" />
		</div>
	</div>


	<div class="row clearfix">

		<div class="col-xs-6 column">
			<h3>
				People Search</h3><br />

        <font size="2">
        <form action="" role="form">
          <div class="form-group">
              <input type="text" class="form-control">
              <br />
              <input type="checkbox" name="vehicle" value="Bike">People<br />
              <input type="checkbox" name="vehicle" value="Car">Relationship <br />
              <input type="checkbox" name="vehicle" value="Bike">Profession<br />
              <input type="checkbox" name="vehicle" value="Car">School<br />
            </font>
              <a href="#" class="btn" type="button" style="background-color:lightgreen">Search</a>
          </div>
          </form>
        </div>


      		<div class="col-xs-6 column">
      			   <h3>Job Search 		</h3><br />

                <font size="2">
                <form action="" role="form">
                   <div class="form-group">
                    <input type="text" class="form-control">
                    <br />
                    <input type="checkbox" name="vehicle" value="Bike">Jobs<br />
                    <input type="checkbox" name="vehicle" value="Car">Companies <br />
                    <input type="checkbox" name="vehicle" value="Bike">Industry<br />
                    </font>
                    <a href="#" class="btn" type="button" style="background-color:lightgreen">Search</a>
                    </div>
                </form>
              </div>
            </div>
                <div class="row clearfix">
                  <div class="col-xs-2"></div>
                  <div class="col-xs-8">
                    <div class="feed-div">
              			"""),_display_(Seq[Any](/*61.19*/for(user <- users) yield /*61.37*/{_display_(Seq[Any](format.raw/*61.38*/("""
              					<a href=""""),_display_(Seq[Any](/*62.30*/routes/*62.36*/.SearchController.loadSearchedProfile(user.email))),format.raw/*62.85*/("""">
              					<div class="panel panel-default">
              						<div class="panel-body">
              						      <div>
                                  """),_display_(Seq[Any](/*66.36*/if(user.profilePicture != null)/*66.67*/{_display_(Seq[Any](format.raw/*66.68*/("""
                          					<img class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*67.74*/routes/*67.80*/.DbController.getProfilePic(user.email))),format.raw/*67.119*/("""" />
                          				""")))}/*68.32*/else/*68.36*/{_display_(Seq[Any](format.raw/*68.37*/("""
                          					<img alt="140x140" class = "feed-image feed-head" src=""""),_display_(Seq[Any](/*69.88*/routes/*69.94*/.Assets.at("images/profile_holder.png"))),format.raw/*69.133*/("""" />
                          				""")))})),format.raw/*70.32*/("""
              							       <h3 class="panel-title head-text feed-head">"""),_display_(Seq[Any](/*71.74*/user/*71.78*/.userName)),format.raw/*71.87*/("""</h3>
                      						</div>
                      						<br>
                      						<p style="padding-top: 10px;">"""),_display_(Seq[Any](/*74.60*/user/*74.64*/.aboutMe)),format.raw/*74.72*/("""</p>
                                  <p style="padding-top: 10px;">"""),_display_(Seq[Any](/*75.66*/user/*75.70*/.location)),format.raw/*75.79*/("""</p>
                      					</div>
                      				</div>
                				</a>
                			""")))})),format.raw/*79.21*/("""
        		    </div>
              </div>
            <div class="col-xs-2"></div>
          </div>
	</div>




""")))})),format.raw/*89.2*/("""
"""))}
    }
    
    def render(users:List[UserModel]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[UserModel]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
<<<<<<< HEAD
                    DATE: Mon May 04 13:38:52 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/search.scala.html
                    HASH: ca2dc3a3eb558a91cdb0cba9a7fadf9597a2acaf
                    MATRIX: 784->1|919->25|949->47|988->52|1014->70|1053->72|1091->76|1104->82|1132->89|3167->2088|3201->2106|3240->2107|3307->2138|3322->2144|3393->2193|3601->2365|3641->2396|3680->2397|3791->2472|3806->2478|3868->2517|3924->2554|3937->2558|3976->2559|4101->2648|4116->2654|4178->2693|4247->2730|4358->2805|4371->2809|4402->2818|4574->2954|4587->2958|4617->2966|4724->3037|4737->3041|4768->3050|4921->3171|5076->3295
=======
                    DATE: Mon May 04 19:44:30 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/search.scala.html
                    HASH: 26320fc5a403221d3bfae109d77749c52110fa5b
                    MATRIX: 784->1|918->25|946->44|983->47|1009->65|1048->67|1085->70|1098->76|1126->83|3107->2028|3141->2046|3180->2047|3246->2077|3261->2083|3332->2132|3536->2300|3576->2331|3615->2332|3725->2406|3740->2412|3802->2451|3857->2487|3870->2491|3909->2492|4033->2580|4048->2586|4110->2625|4178->2661|4288->2735|4301->2739|4332->2748|4501->2881|4514->2885|4544->2893|4650->2963|4663->2967|4694->2976|4843->3093|4988->3207
>>>>>>> b3a22e47a1a7935bbebab4765ffc738bee4e6801
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|89->61|89->61|89->61|90->62|90->62|90->62|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|97->69|97->69|97->69|98->70|99->71|99->71|99->71|102->74|102->74|102->74|103->75|103->75|103->75|107->79|117->89
                    -- GENERATED --
                */
            