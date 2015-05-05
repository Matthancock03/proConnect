
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
"""),_display_(Seq[Any](/*6.2*/navbar/*6.8*/.render)),format.raw/*6.15*/("""
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

					"""),_display_(Seq[Any](/*54.7*/for((message, index) <- messages.zipWithIndex) yield /*54.53*/{_display_(Seq[Any](format.raw/*54.54*/("""
					<tr>
						<td>
							"""),_display_(Seq[Any](/*57.9*/{index + 1})),format.raw/*57.20*/("""
						</td>
						<td>
							<a data-toggle="collapse" data-target="#"""),_display_(Seq[Any](/*60.49*/index)),format.raw/*60.54*/("""">"""),_display_(Seq[Any](/*60.57*/message/*60.64*/.messageTitle)),format.raw/*60.77*/("""</a>
						</td>
						<td>
							"""),_display_(Seq[Any](/*63.9*/message/*63.16*/.senderName)),format.raw/*63.27*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*66.9*/message/*66.16*/.tstamp)),format.raw/*66.23*/("""
						</td>
						<td>
							"""),_display_(Seq[Any](/*69.9*/if(message.isRead)/*69.27*/{_display_(Seq[Any](format.raw/*69.28*/("""
								Read
							""")))}/*71.9*/else/*71.13*/{_display_(Seq[Any](format.raw/*71.14*/("""
								Unread
							""")))})),format.raw/*73.9*/("""
						</td>
					</tr>

					<tr id=""""),_display_(Seq[Any](/*77.15*/index)),format.raw/*77.20*/("""" class="collapse">
						<td>#</td>
						<td colspan="4">"""),_display_(Seq[Any](/*79.24*/message/*79.31*/.messageBody)),format.raw/*79.43*/("""</td>
						<td>
							<a href="#" ><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target=".bs-example-modal-lg"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button></a>
							<a href=""""),_display_(Seq[Any](/*82.18*/routes/*82.24*/.MessageController.deleteMessage(message.messageId))),format.raw/*82.75*/("""" ><span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span></a>
						</td>
					</tr>

				""")))})),format.raw/*86.6*/("""
				</tbody>
			</table>

			<!-- Large modal -->

  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

          """),_display_(Seq[Any](/*96.12*/form(routes.UserController.replyMessage())/*96.54*/{_display_(Seq[Any](format.raw/*96.55*/("""

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
          	""")))})),format.raw/*126.13*/("""
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
""")))})),format.raw/*163.2*/("""
"""))}
    }
    
    def render(messages:List[Message]): play.api.templates.HtmlFormat.Appendable = apply(messages)
    
    def f:((List[Message]) => play.api.templates.HtmlFormat.Appendable) = (messages) => apply(messages)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 04 22:14:10 PDT 2015
                    SOURCE: /home/misanthropic/repos/schoolWork/proConnect/web-app/app/views/message.scala.html
                    HASH: 32c6aeffa4a73a70a77cfef7c773b6fb8d83a2e8
                    MATRIX: 783->1|918->26|946->45|982->47|1007->64|1045->65|1081->67|1094->73|1122->80|2284->1207|2346->1253|2385->1254|2450->1284|2483->1295|2591->1367|2618->1372|2657->1375|2673->1382|2708->1395|2779->1431|2795->1438|2828->1449|2895->1481|2911->1488|2940->1495|3007->1527|3034->1545|3073->1546|3113->1568|3126->1572|3165->1573|3220->1597|3295->1636|3322->1641|3418->1701|3434->1708|3468->1720|3747->1963|3762->1969|3835->2020|3977->2131|4281->2399|4332->2441|4371->2442|5432->3470|5997->4003
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|82->54|82->54|82->54|85->57|85->57|88->60|88->60|88->60|88->60|88->60|91->63|91->63|91->63|94->66|94->66|94->66|97->69|97->69|97->69|99->71|99->71|99->71|101->73|105->77|105->77|107->79|107->79|107->79|110->82|110->82|110->82|114->86|124->96|124->96|124->96|154->126|191->163
                    -- GENERATED --
                */
            