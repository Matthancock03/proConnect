
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
object profileEdit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[UserModel,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:UserModel):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("ProConect")/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
"""),_display_(Seq[Any](/*7.2*/navbar/*7.8*/.render)),format.raw/*7.15*/("""
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*8.31*/routes/*8.37*/.Assets.at("stylesheets/profile.css"))),format.raw/*8.74*/("""">


<div class="container">
  <div class="row clearfix">
    <div class="col-md-4 column img-div">
      """),_display_(Seq[Any](/*14.8*/if(user.profilePicture != null)/*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""
        <img class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*15.57*/routes/*15.63*/.DbController.getProfilePic(user.email))),format.raw/*15.102*/("""" />
      """)))}/*16.8*/else/*16.12*/{_display_(Seq[Any](format.raw/*16.13*/("""
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/("""" />
        """)))})),format.raw/*18.10*/("""
        <a href=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.DbController.profileMain())),format.raw/*19.52*/("""">
          <div>
          <br />
          <button type="button" class="btn btn-success edit-button" name="editButton">Edit Profile</button></a>

        </div>
        """),_display_(Seq[Any](/*25.10*/if(user.isPremium)/*25.28*/{_display_(Seq[Any](format.raw/*25.29*/("""
          <!-- Large modal -->
          <button type="button" class="btn btn-success edit-button" data-toggle="modal" data-target=".bs-example-modal-lg">Post Job</button>
        """)))})),format.raw/*28.10*/("""
        </div>


          <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
              <div class="modal-content">

                  """),_display_(Seq[Any](/*36.20*/form(routes.UserController.postJob())/*36.57*/{_display_(Seq[Any](format.raw/*36.58*/("""

                  	<div class="form-group" style="width: 50%; margin: 0 auto;">
                    <div style="width: 75%; margin: 0 auto;">
                  		<h2 class="form-signin-heading">Post Job</h2>
                  			<input class="form-control"
                  					placeholder="Job Title"
                  					type="text"
                  					name="jobTitle"
                  					id="jobTitle"
                  					value=""
                  				/>
                          <input class="form-control"
                    					placeholder="Company"
                    					type="text"
                    					name="company"
                    					id="company"
                    					value=""
                    				/>
                  			<input class="form-control"
                  					placeholder="Job Description"
                  					type="text"
                  					name="jobDescription"
                  					id="jobDescription"
                  					value=""
                  				/>
                          <input class="form-control"
                    					placeholder=""
                    					type="text"
                    					name="email"
                    					id="email"
                    					value=""""),_display_(Seq[Any](/*67.34*/user/*67.38*/.email)),format.raw/*67.44*/(""""
                              style="display: none; margin-bottom: 15px;"
                    				/>

                  		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%; margin-bottom: 15px;">Post Job</button>
                    </div>
                	</div>
                  	""")))})),format.raw/*74.21*/("""
              </div>
            </div>
          </div> <!-- End modal -->


<br />
        <div class="col-xs-6 column">
          <div class="centerDiv" style="background-color: #FFFFFF;">
           """),_display_(Seq[Any](/*83.13*/if(user.userName != null)/*83.38*/{_display_(Seq[Any](format.raw/*83.39*/("""
              <h4 class="nameText">"""),_display_(Seq[Any](/*84.37*/user/*84.41*/.userName)),format.raw/*84.50*/("""</h4>
            """)))}/*85.14*/else/*85.18*/{_display_(Seq[Any](format.raw/*85.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*87.14*/("""
<br />
            """),_display_(Seq[Any](/*89.14*/if(user.location != null)/*89.39*/{_display_(Seq[Any](format.raw/*89.40*/("""
                <p class="headText"syle="margin-top: -10px;">"""),_display_(Seq[Any](/*90.63*/user/*90.67*/.location)),format.raw/*90.76*/("""</p>
            """)))})),format.raw/*91.14*/("""

            """),_display_(Seq[Any](/*93.14*/if(user.currentEmployer != null)/*93.46*/{_display_(Seq[Any](format.raw/*93.47*/("""
                <p class="headText">"""),_display_(Seq[Any](/*94.38*/user/*94.42*/.currentEmployer)),format.raw/*94.58*/("""</p>
            """)))})),format.raw/*95.14*/("""

            """),_display_(Seq[Any](/*97.14*/if(user.recentSchool != null)/*97.43*/{_display_(Seq[Any](format.raw/*97.44*/("""
                <p class="headText">"""),_display_(Seq[Any](/*98.38*/user/*98.42*/.recentSchool)),format.raw/*98.55*/("""</p>
            """)))})),format.raw/*99.14*/("""

            """),_display_(Seq[Any](/*101.14*/if(user.headline != null)/*101.39*/{_display_(Seq[Any](format.raw/*101.40*/("""
              <p class="headText">"""),_display_(Seq[Any](/*102.36*/user/*102.40*/.headline)),format.raw/*102.49*/("""</p>
            """)))})),format.raw/*103.14*/("""
          </div>
          <br /><br /><br />
    <div class="centerDiv" style="background-color: #FFFFFF;">
        <h2>
          About Me:
        </h2>
        """),_display_(Seq[Any](/*110.10*/if(user.aboutMe != null)/*110.34*/{_display_(Seq[Any](format.raw/*110.35*/("""
          <p>
            """),_display_(Seq[Any](/*112.14*/user/*112.18*/.aboutMe)),format.raw/*112.26*/("""
          </p>
        """)))})),format.raw/*114.10*/("""
<br />
      <h2>
        Experience:
      </h2>
      """),_display_(Seq[Any](/*119.8*/if(user.experience != null)/*119.35*/{_display_(Seq[Any](format.raw/*119.36*/("""
      <p>
        """),_display_(Seq[Any](/*121.10*/user/*121.14*/.experience)),format.raw/*121.25*/("""
      </p>
      """)))})),format.raw/*123.8*/("""
<br />
      <h2>
        Projects or Skills Highlight:
      </h2>
      """),_display_(Seq[Any](/*128.8*/if(user.experience != null)/*128.35*/{_display_(Seq[Any](format.raw/*128.36*/("""
      <p>
        """),_display_(Seq[Any](/*130.10*/user/*130.14*/.projects)),format.raw/*130.23*/("""
      </p>
      """)))})),format.raw/*132.8*/("""
<br />
      <h2>
        Education:
      </h2>
      """),_display_(Seq[Any](/*137.8*/if(user.experience != null)/*137.35*/{_display_(Seq[Any](format.raw/*137.36*/("""
      <p>
        """),_display_(Seq[Any](/*139.10*/user/*139.14*/.education)),format.raw/*139.24*/("""
      </p>
      """)))})),format.raw/*141.8*/("""
    </div>
    </div>
</div>
</div>
""")))})),format.raw/*146.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 07 00:26:11 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/profileEdit.scala.html
                    HASH: 61771a8b1cedf985b4cbc5df155e00fa1903ff5d
                    MATRIX: 783->1|909->17|937->36|974->39|999->56|1037->57|1073->59|1086->65|1114->72|1180->103|1194->109|1252->146|1394->253|1434->284|1473->285|1566->342|1581->348|1643->387|1673->399|1686->403|1725->404|1832->475|1847->481|1909->520|1955->534|2010->553|2025->559|2074->586|2283->759|2310->777|2349->778|2563->960|2865->1226|2911->1263|2950->1264|4257->2535|4270->2539|4298->2545|4647->2862|4888->3067|4922->3092|4961->3093|5034->3130|5047->3134|5078->3143|5116->3162|5129->3166|5168->3167|5243->3210|5300->3231|5334->3256|5373->3257|5472->3320|5485->3324|5516->3333|5566->3351|5617->3366|5658->3398|5697->3399|5771->3437|5784->3441|5822->3457|5872->3475|5923->3490|5961->3519|6000->3520|6074->3558|6087->3562|6122->3575|6172->3593|6224->3608|6259->3633|6299->3634|6372->3670|6386->3674|6418->3683|6469->3701|6672->3867|6706->3891|6746->3892|6811->3920|6825->3924|6856->3932|6914->3957|7008->4015|7045->4042|7085->4043|7142->4063|7156->4067|7190->4078|7241->4097|7353->4173|7390->4200|7430->4201|7487->4221|7501->4225|7533->4234|7584->4253|7677->4310|7714->4337|7754->4338|7811->4358|7825->4362|7858->4372|7909->4391|7979->4429
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|53->25|53->25|53->25|56->28|64->36|64->36|64->36|95->67|95->67|95->67|102->74|111->83|111->83|111->83|112->84|112->84|112->84|113->85|113->85|113->85|115->87|117->89|117->89|117->89|118->90|118->90|118->90|119->91|121->93|121->93|121->93|122->94|122->94|122->94|123->95|125->97|125->97|125->97|126->98|126->98|126->98|127->99|129->101|129->101|129->101|130->102|130->102|130->102|131->103|138->110|138->110|138->110|140->112|140->112|140->112|142->114|147->119|147->119|147->119|149->121|149->121|149->121|151->123|156->128|156->128|156->128|158->130|158->130|158->130|160->132|165->137|165->137|165->137|167->139|167->139|167->139|169->141|174->146
                    -- GENERATED --
                */
            