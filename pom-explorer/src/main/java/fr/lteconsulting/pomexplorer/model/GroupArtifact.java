package fr.lteconsulting.pomexplorer.model;

public class GroupArtifact
{
	protected final String groupId;

	protected final String artifactId;

	public GroupArtifact( String groupId, String artifactId )
	{
		this.groupId = groupId;
		this.artifactId = artifactId;
	}

	public String getGroupId()
	{
		return groupId;
	}

	public String getArtifactId()
	{
		return artifactId;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artifactId == null) ? 0 : artifactId.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		return result;
	}

	@Override
	public boolean equals( Object obj )
	{
		if( this == obj )
			return true;
		if( obj == null )
			return false;
		if( getClass() != obj.getClass() )
			return false;
		GroupArtifact other = (GroupArtifact) obj;
		if( artifactId == null )
		{
			if( other.artifactId != null )
				return false;
		}
		else if( !artifactId.equals( other.artifactId ) )
			return false;
		if( groupId == null )
		{
			if( other.groupId != null )
				return false;
		}
		else if( !groupId.equals( other.groupId ) )
			return false;
		return true;
	}
}
