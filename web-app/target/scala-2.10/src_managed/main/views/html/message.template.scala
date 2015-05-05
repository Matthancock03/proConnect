
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
object message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Message],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[Message]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("ProConect")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*6.32*/routes/*6.38*/.Assets.at("stylesheets/index.min.css"))),format.raw/*6.77*/("""">

"""),_display_(Seq[Any](/*8.2*/navbar/*8.8*/.render)),format.raw/*8.15*/("""
<div class="container">
	<div class="row clearfix">
		<div class="col-xs-12 column">
			<div class="page-header">
				<h1>
					Messages
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-xs-2 column">

			<div class="btn-group btn-group-vertical btn-group-md">
			<br /><br /><br />
			 <button type="button" class="btn btn-success">Compose</button>
			 <br />
				 <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-left"></em>Inbox</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-center"></em> Sent</button> <button class="btn btn-default" type="button"><em class="glyphicon glyphicon-align-right"></em> Trash</button> <
			</div>
		</div>
		<div class="col-xs-6 column">

			<table class="table table-condensed" style="background-color: #FFFFFF;">
				<thead>
					<tr>
						<th>
							#
						</th>
						<th>
							Message
						</th>
						<th>
							From
						</th>
						<th>
							Date
						</th>
						<th>
							Status
						</th>
						<th>

						</th>
					</tr>
				</thead>
				<tbody>

					"""),_display_(Seq[Any](/*56.7*/for((message, index) <- messages.zipWithIndex) yield /*56.53*/{_display_(Seq[Any](format.raw/*56.54*/("""
					<tr>
						<td>
							"""),_display_(Seq[Any](/*59.9*/{index + 1})),format.raw/*59.20*/("""
						</td>
						<td>
							<a data-toggle="collapse" data-target="#"""),_display_(Seq[Any](/*62.49*/index)),format.raw/*62.54*/("""">"""),_display_(Seq[Any](/*62.57*/message/*62.64*/.messageTitle)),format.raw/*62.77*/("""</a>
						</td>
						<td>
							"""),_display_(Seq[Any](/*65.9*/message/*65.16*/.senderName)),format.raw/*65.27*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*68.9*/message/*68.16*/.tstamp)),format.raw/*68.23*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*71.9*/if(message.isRead)/*71.27*/{_display_(Seq[Any](format.raw/*71.28*/("""
								Read
							""")))}/*73.9*/else/*73.13*/{_display_(Seq[Any](format.raw/*73.14*/("""
								Unread
							""")))})),format.raw/*75.9*/("""
						</td>
					</tr>

					<tr id=""""),_display_(Seq[Any](/*79.15*/index)),format.raw/*79.20*/("""" class="collapse">
						<td>#</td>
						<td colspan="4">"""),_display_(Seq[Any](/*81.24*/message/*81.31*/.messageBody)),format.raw/*81.43*/("""</td>
						<td>
							<a href="#" ><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target=".bs-example-modal-lg"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button></a>
							<a href=""""),_display_(Seq[Any](/*84.18*/routes/*84.24*/.MessageController.deleteMessage(message.messageId))),format.raw/*84.75*/("""" ><span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></a>
						</td>
					</tr>

				""")))})),format.raw/*88.6*/("""
				</tbody>
			</table>

			<!-- Large modal -->

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*98.12*/form(routes.UserController.replyMessage())/*98.54*/{_display_(Seq[Any](format.raw/*98.55*/("""

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
            					placeholder="User Id"
            					type="text"
            					name="id"
            					id="id"
            					value=""
                      style="display: none;"
            				/>
          		<button class="btn btn-primary btn-lg btn-block" type="submit" style="width: 50%;">Send Message</button>
            </div>
        	</div>
          	""")))})),format.raw/*128.13*/("""
      </div>
    </div>
  </div> <!-- End modal -->

		</div>
	</div>
	<div class="row clearfix">
		<div class="col-xs-4 column">
		</div>
		<div class="col-xs-8 column">
			<ul class="pagination">
				<li>
					<a href="#">Prev</a>
				</li>
				<li>
					<a href="#">1</a>
				</li>
				<li>
					<a href="#">2</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">4</a>
				</li>
				<li>
					<a href="#">5</a>
				</li>
				<li>
					<a href="#">Next</a>
				</li>
			</ul>
		</div>
	</div>
</div>
""")))})),format.raw/*165.2*/("""
"""))}
    }
    
    def render(messages:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(messages)
    
    def f:((List[Message]) => play.api.templates.HtmlFormat.Appendable) = (messages) => apply(messages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 05 11:02:40 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/message.scala.html
                    HASH: f7fc21162b414cf60df6df1479bd624944d72fa2
                    MATRIX: 783->1|918->26|946->45|982->47|1007->64|1045->65|1112->97|1126->103|1186->142|1225->147|1238->153|1266->160|2428->1287|2490->1333|2529->1334|2594->1364|2627->1375|2735->1447|2762->1452|2801->1455|2817->1462|2852->1475|2923->1511|2939->1518|2972->1529|3039->1561|3055->1568|3084->1575|3151->1607|3178->1625|3217->1626|3257->1648|3270->1652|3309->1653|3364->1677|3439->1716|3466->1721|3562->1781|3578->1788|3612->1800|3891->2043|3906->2049|3979->2100|4121->2211|4425->2479|4476->2521|4515->2522|5576->3550|6141->4083
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|36->8|36->8|36->8|84->56|84->56|84->56|87->59|87->59|90->62|90->62|90->62|90->62|90->62|93->65|93->65|93->65|96->68|96->68|96->68|99->71|99->71|99->71|101->73|101->73|101->73|103->75|107->79|107->79|109->81|109->81|109->81|112->84|112->84|112->84|116->88|126->98|126->98|126->98|156->128|193->165
                    -- GENERATED --
                */
            