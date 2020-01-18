<#import "common.ftl" as c>
<@c.page>
    ${title}

    <form action="/person" method="post">
        <div>
            <input type="text" name="name">
            <button type="submit">Post</button>
        </div>
        <div>
        </div>
        <#-- <input type="hidden" name="_csrf" value="${_csrf.token}"/>-->
    </form>
    <div>
        <p>user name is </p>
        <#if personName??>
            Hi ${personName}, How are you?
        </#if>
    </div>
</@c.page>