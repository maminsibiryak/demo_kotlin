<#import "../parts/common.ftl" as c>
<@c.page>
    <div class="container">
        <#list listOfNote as notes>
            ${notes.id}
            ${notes.text}
        </#list>
    </div>
</@c.page>