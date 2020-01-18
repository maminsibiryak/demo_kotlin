<#import "parts/common.ftl" as c>
<@c.page>
    <div class="container">
        ${title}
        <form action="/person" method="post">
            <div class="form-group">
                <input class="form-control" type="text" name="name" placeholder="What is your name?">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            <#-- <input type="hidden" name="_csrf" value="${_csrf.token}"/>-->
        </form>

        <#if personName??>
            Hi ${personName}, How are you?
        </#if>
    </div>
</@c.page>