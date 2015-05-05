
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
        <img alt="140x140" class = "img-thumbnail profileImage" src=""""),_display_(Seq[Any](/*17.71*/routes/*17.77*/.Assets.at("images/profile_holder.png"))),format.raw/*17.116*/("""" />
        """)))})),format.raw/*18.10*/("""
        """),_display_(Seq[Any](/*19.10*/if(user.userName != null)/*19.35*/{_display_(Seq[Any](format.raw/*19.36*/("""
              <h4>"""),_display_(Seq[Any](/*20.20*/user/*20.24*/.userName)),format.raw/*20.33*/("""</h4>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
              <h4>Guest</h4>
            """)))})),format.raw/*23.14*/("""
  <a href=""""),_display_(Seq[Any](/*24.13*/routes/*24.19*/.UserController.addConnection(user.email))),format.raw/*24.60*/(""""><button type="button" class="btn btn-default edit-button" name="connect">Connect</button></a>

      <!-- Large modal -->
  <button type="button" class="btn btn-default edit-button" data-toggle="modal" data-target=".bs-example-modal-lg">Send Message</button>

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*33.12*/form(routes.UserController.sendMessage())/*33.53*/{_display_(Seq[Any](format.raw/*33.54*/("""

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
            					value=""""),_display_(Seq[Any](/*57.26*/user/*57.30*/.email)),format.raw/*57.36*/(""""
                      style="display: none;"
            				/>

          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*64.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->


    </div>
    <div class="col-xs-2"></div>

    <div class="col-md-6 column" style="background-color: #FFFFFF;">
        """),_display_(Seq[Any](/*74.10*/if(user.aboutMe != null)/*74.34*/{_display_(Seq[Any](format.raw/*74.35*/("""
          <h3>"""),_display_(Seq[Any](/*75.16*/user/*75.20*/.aboutMe)),format.raw/*75.28*/("""</h3>
        """)))})),format.raw/*76.10*/("""

      """),_display_(Seq[Any](/*78.8*/if(user.currentEmployer != null)/*78.40*/{_display_(Seq[Any](format.raw/*78.41*/("""
          <h3>"""),_display_(Seq[Any](/*79.16*/user/*79.20*/.currentEmployer)),format.raw/*79.36*/("""</h3>
        """)))})),format.raw/*80.10*/("""

      """),_display_(Seq[Any](/*82.8*/if(user.location != null)/*82.33*/{_display_(Seq[Any](format.raw/*82.34*/("""
          <h3>"""),_display_(Seq[Any](/*83.16*/user/*83.20*/.location)),format.raw/*83.29*/("""</h3>
        """)))})),format.raw/*84.10*/("""
    </div>
    <div class="col-xs-2"></div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
      <div class="col-xs-8 column" style="background-color: #FFFFFF;">
        <h2>
          About Me
        </h2>
        """),_display_(Seq[Any](/*96.10*/if(user.aboutMe != null)/*96.34*/{_display_(Seq[Any](format.raw/*96.35*/("""
          <p>
            """),_display_(Seq[Any](/*98.14*/user/*98.18*/.aboutMe)),format.raw/*98.26*/("""
          </p>
        """)))})),format.raw/*100.10*/("""

      </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Experience
      </h2>
      """),_display_(Seq[Any](/*112.8*/if(user.experience != null)/*112.35*/{_display_(Seq[Any](format.raw/*112.36*/("""
      <p>
        """),_display_(Seq[Any](/*114.10*/user/*114.14*/.experience)),format.raw/*114.25*/("""
      </p>
      """)))})),format.raw/*116.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Projects or Skills Highlight
      </h2>
      """),_display_(Seq[Any](/*127.8*/if(user.experience != null)/*127.35*/{_display_(Seq[Any](format.raw/*127.36*/("""
      <p>
        """),_display_(Seq[Any](/*129.10*/user/*129.14*/.projects)),format.raw/*129.23*/("""
      </p>
      """)))})),format.raw/*131.8*/("""
    </div>
  </div>
  <div class="row clearfix">
    <div class="col-xs-4">

    </div>
    <div class="col-xs-8 column" style="background-color: #FFFFFF;">
      <h2>
        Education
      </h2>
      """),_display_(Seq[Any](/*142.8*/if(user.experience != null)/*142.35*/{_display_(Seq[Any](format.raw/*142.36*/("""
      <p>
        """),_display_(Seq[Any](/*144.10*/user/*144.14*/.education)),format.raw/*144.24*/("""
      </p>
      """)))})),format.raw/*146.8*/("""
    </div>
  </div>
</div>
""")))})),format.raw/*150.2*/("""
"""))}
    }
    
    def render(user:UserModel): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((UserModel) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 21:40:29 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/searchedProfile.scala.html
                    HASH: ac2ff1f22fbd7bc256ff293e8025de7c1ac3ed92
                    MATRIX: 787->1|913->17|941->36|1007->67|1021->73|1083->114|1122->119|1147->136|1185->137|1221->139|1234->145|1262->152|1402->257|1442->288|1481->289|1574->346|1589->352|1651->391|1681->403|1694->407|1733->408|1840->479|1855->485|1917->524|1963->538|2009->548|2043->573|2082->574|2138->594|2151->598|2182->607|2220->626|2233->630|2272->631|2347->674|2396->687|2411->693|2474->734|2988->1212|3038->1253|3077->1254|3927->2068|3940->2072|3968->2078|4231->2309|4445->2487|4478->2511|4517->2512|4569->2528|4582->2532|4612->2540|4659->2555|4703->2564|4744->2596|4783->2597|4835->2613|4848->2617|4886->2633|4933->2648|4977->2657|5011->2682|5050->2683|5102->2699|5115->2703|5146->2712|5193->2727|5477->2975|5510->2999|5549->3000|5613->3028|5626->3032|5656->3040|5714->3065|5960->3275|5997->3302|6037->3303|6094->3323|6108->3327|6142->3338|6193->3357|6454->3582|6491->3609|6531->3610|6588->3630|6602->3634|6634->3643|6685->3662|6927->3868|6964->3895|7004->3896|7061->3916|7075->3920|7108->3930|7159->3949|7220->3978
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|51->23|52->24|52->24|52->24|61->33|61->33|61->33|85->57|85->57|85->57|92->64|102->74|102->74|102->74|103->75|103->75|103->75|104->76|106->78|106->78|106->78|107->79|107->79|107->79|108->80|110->82|110->82|110->82|111->83|111->83|111->83|112->84|124->96|124->96|124->96|126->98|126->98|126->98|128->100|140->112|140->112|140->112|142->114|142->114|142->114|144->116|155->127|155->127|155->127|157->129|157->129|157->129|159->131|170->142|170->142|170->142|172->144|172->144|172->144|174->146|178->150
                    -- GENERATED --
                */
            