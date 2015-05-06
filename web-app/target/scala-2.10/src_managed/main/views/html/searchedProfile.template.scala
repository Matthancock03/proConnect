
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
object searchedProfile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*4.1*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*5.31*/routes/*5.37*/.Assets.at("stylesheets/profile.min.css"))),format.raw/*5.78*/("""">

"""),_display_(Seq[Any](/*7.2*/main("ProConect")/*7.19*/{_display_(Seq[Any](format.raw/*7.20*/("""
"""),_display_(Seq[Any](/*8.2*/navbar/*8.8*/.render)),format.raw/*8.15*/("""


<div class="container">
  <div class="row clearfix">
    <div class="col-md-2 column img-div">
      """),_display_(Seq[Any](/*14.8*/if(user.profilePicture != null)/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*15.57*/routes/*15.63*/.DbController.getProfilePic(user.email))),format.raw/*15.102*/("""" />
      """)))}/*16.8*/else/*16.12*/{_display_(Seq[Any](format.raw/*16.13*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/(""""/>
        """)))})),format.raw/*18.10*/("""
         <a href=""""),_display_(Seq[Any](/*19.20*/routes/*19.26*/.UserController.addConnection(user.email))),format.raw/*19.67*/(""""><button type="button" class="btn btn-success edit-button" name="connect">Connect</button></a>

      <!-- Large modal -->
  <button type="button" class="btn btn-success edit-button" data-toggle="modal" data-target=".bs-example-modal-lg">Send Message</button>
        </div>

<br />
        <div class="col-xs-6 column">
          <div class="centerDiv" style="background-color: #FFFFFF;">
        """),_display_(Seq[Any](/*28.10*/if(user.userName != null)/*28.35*/{_display_(Seq[Any](format.raw/*28.36*/("""

              <h4>"""),_display_(Seq[Any](/*30.20*/user/*30.24*/.userName)),format.raw/*30.33*/("""</h4>
            """)))}/*31.14*/else/*31.18*/{_display_(Seq[Any](format.raw/*31.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*33.14*/("""
            """),_display_(Seq[Any](/*34.14*/if(user.aboutMe != null)/*34.38*/{_display_(Seq[Any](format.raw/*34.39*/("""
          <h3>"""),_display_(Seq[Any](/*35.16*/user/*35.20*/.aboutMe)),format.raw/*35.28*/("""</h3>
        """)))})),format.raw/*36.10*/("""

      """),_display_(Seq[Any](/*38.8*/if(user.currentEmployer != null)/*38.40*/{_display_(Seq[Any](format.raw/*38.41*/("""
          <h3>"""),_display_(Seq[Any](/*39.16*/user/*39.20*/.currentEmployer)),format.raw/*39.36*/("""</h3>
        """)))})),format.raw/*40.10*/("""

      """),_display_(Seq[Any](/*42.8*/if(user.location != null)/*42.33*/{_display_(Seq[Any](format.raw/*42.34*/("""
          <h3>"""),_display_(Seq[Any](/*43.16*/user/*43.20*/.location)),format.raw/*43.29*/("""</h3>
        """)))})),format.raw/*44.10*/("""
            </div>
            </div>

  

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*54.12*/form(routes.UserController.sendMessage())/*54.53*/{_display_(Seq[Any](format.raw/*54.54*/("""

          	<div class="form-group" style="width: 50%; margin: 0 auto;">
            <div style="width: 75%; margin: 0 auto;">
          		<h2 class="form-signin-heading">Message</h2>
          			<input class="form-control"
          					placeholder="Message Title"
          					type="text"
          					name="messageTitle"
          					id="messageTitle"
          					value=""
          				/>
          			<input class="form-control"
          					placeholder="Message"
          					type="text"
          					name="messageBody"
          					id="messageBody"
          					value=""
          				/>
                  <input class="form-control"
            					placeholder="Message"
            					type="text"
            					name="email"
            					id="email"
            					value=""""),_display_(Seq[Any](/*78.26*/user/*78.30*/.email)),format.raw/*78.36*/(""""
                      style="display: none;"
            				/>

          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*85.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->


    </div>
    <div class="row clearfix">
    <div class="col-md-2 column img-div"></div>

    
    
     
        <div class="col-xs-6 column">
          <div class="centerDiv" style="background-color: #FFFFFF;">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*103.10*/if(user.aboutMe != null)/*103.34*/{_display_(Seq[Any](format.raw/*103.35*/("""
          <p>
            """),_display_(Seq[Any](/*105.14*/user/*105.18*/.aboutMe)),format.raw/*105.26*/("""
          </p>
        """)))})),format.raw/*107.10*/("""

      <br />
  
    
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*115.8*/if(user.experience != null)/*115.35*/{_display_(Seq[Any](format.raw/*115.36*/("""
      <p>
        """),_display_(Seq[Any](/*117.10*/user/*117.14*/.experience)),format.raw/*117.25*/("""
      </p>
      """)))})),format.raw/*119.8*/("""
    <br />

    
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*126.8*/if(user.experience != null)/*126.35*/{_display_(Seq[Any](format.raw/*126.36*/("""
      <p>
        """),_display_(Seq[Any](/*128.10*/user/*128.14*/.projects)),format.raw/*128.23*/("""
      </p>
      """)))})),format.raw/*130.8*/("""
    <br />
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*135.8*/if(user.experience != null)/*135.35*/{_display_(Seq[Any](format.raw/*135.36*/("""
      <p>
        """),_display_(Seq[Any](/*137.10*/user/*137.14*/.education)),format.raw/*137.24*/("""
      </p>
      """)))})),format.raw/*139.8*/("""
      <br />
    </div>
  </div>
</div>
""")))})),format.raw/*144.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 06 14:44:55 PDT 2015
                    SOURCE: C:/Users/Roya/Documents/GitHub/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: de5dc3f5bb97e76c178b6d5c08120db39df6eefc
                    MATRIX: 787->1|914->17|944->39|1011->71|1025->77|1087->118|1128->125|1153->142|1191->143|1228->146|1241->152|1269->159|1415->270|1455->301|1494->302|1588->360|1603->366|1665->405|1696->418|1709->422|1748->423|1856->495|1871->501|1933->540|1979->554|2036->575|2051->581|2114->622|2559->1031|2593->1056|2632->1057|2691->1080|2704->1084|2735->1093|2774->1113|2787->1117|2826->1118|2903->1163|2954->1178|2987->1202|3026->1203|3079->1220|3092->1224|3122->1232|3170->1248|3216->1259|3257->1291|3296->1292|3349->1309|3362->1313|3400->1329|3448->1345|3494->1356|3528->1381|3567->1382|3620->1399|3633->1403|3664->1412|3712->1428|4018->1698|4068->1739|4107->1740|4981->2578|4994->2582|5022->2588|5292->2826|5671->3168|5705->3192|5745->3193|5812->3223|5826->3227|5857->3235|5917->3262|6033->3342|6070->3369|6110->3370|6169->3392|6183->3396|6217->3407|6270->3428|6398->3520|6435->3547|6475->3548|6534->3570|6548->3574|6580->3583|6633->3604|6734->3669|6771->3696|6811->3697|6870->3719|6884->3723|6917->3733|6970->3754|7049->3801
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|56->28|56->28|56->28|58->30|58->30|58->30|59->31|59->31|59->31|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|66->38|66->38|66->38|67->39|67->39|67->39|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|82->54|82->54|82->54|106->78|106->78|106->78|113->85|131->103|131->103|131->103|133->105|133->105|133->105|135->107|143->115|143->115|143->115|145->117|145->117|145->117|147->119|154->126|154->126|154->126|156->128|156->128|156->128|158->130|163->135|163->135|163->135|165->137|165->137|165->137|167->139|172->144
                    -- GENERATED --
                */
            